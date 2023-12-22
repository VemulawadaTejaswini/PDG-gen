import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] primeList = new int[10001];
        int limit = 104743;
        primeList[0] = 2;
        primeList[1] = 3;
        int count = 2;
        for (int i = 5; i <= limit; i += 2) {
            boolean wflag = true;
            for (int j = 1; primeList[j] * primeList[j] <= i; j++) {
                if (i % primeList[j] == 0) {
                    wflag = false;
                    break;
                }
            }
            if (wflag) {
                primeList[count++] = i;
            }
        }
        int[] sum=new int[10001];
        sum[0]=0;
        for(int i=1;i<10001;i++) {
            sum[i]=sum[i-1]+primeList[i-1];
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n=sc.nextInt();
            if(n==0) {
                break;
            }
            System.out.println(sum[n]);
        }
    }
}
