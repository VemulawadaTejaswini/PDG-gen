import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Y = scan.nextInt();
        boolean isFound = false;
        x: for (int i = 0; i <= N; i++) {
            y: for (int j = 0; j <= N - i; j++) {
                int k = N - i - j;
               int total = 10000*i + 5000*j + 1000*k;
               if (total == Y) {
                   System.out.println(i +" "+ j +" "+k);
                   isFound = true;
                   break x;
               }
            }
        }
        if (!isFound) {
            System.out.println(-1 +" "+ -1 +" "+-1);
        }
    }
}