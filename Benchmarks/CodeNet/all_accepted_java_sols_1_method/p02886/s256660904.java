import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i=0; i<n; i++) {
            d[i] = sc.nextInt();
        }
        int sum_delicious = 0;
      	int check = 0;
        int cnt = 0;
        boolean TF = true;
        while(TF) {
            for(int i=cnt+1; i<n; i++) {
                sum_delicious += d[cnt]*d[i];
            }
            cnt++;
            if(cnt == n) TF = false;
        }
        System.out.println(sum_delicious);
    }
}