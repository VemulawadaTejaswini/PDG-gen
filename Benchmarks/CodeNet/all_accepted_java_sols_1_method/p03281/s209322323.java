

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;

        for(int i = 1; i <= N; i++) {
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if(i%2!=0 && i%j==0) count++;
            }
            if(count == 8) res++;
        }
        System.out.println(res);
    }
}
