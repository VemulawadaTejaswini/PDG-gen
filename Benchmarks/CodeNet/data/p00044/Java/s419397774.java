import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] primeList = new int[5200];
        int n = 50000;
        primeList[0] = 2;
        primeList[1] = 3;
        int count = 2;
        for (int i = 5; i <= n; i += 2) { 
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
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int a = 0;
            for (int i = 0; i < primeList.length; i++) {
                if (primeList[i] == m) {
                    a = i;
                    break;
                }
            }
            System.out.println(primeList[a - 1] + " " + primeList[a + 1]);
        }
    }
}

