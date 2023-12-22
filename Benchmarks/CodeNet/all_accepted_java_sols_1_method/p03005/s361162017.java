import java.util.Scanner;

class Main {
    public static void main (String[] arg) {
        int N, K;

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();// 個数
        K = scanner.nextInt(); // 人
        scanner.close();

        int devide = N - (K -1);
         devide = devide - 1;
         
         if (K == 1) System.out.println("0"); 
         else System.out.println(devide);

    } 
}