import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        System.out.println(Math.min(B * ((N + A - 1) / A), D * ((N + C - 1) / C)));
    }
}
