import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int max = 0;

        if (A >= B) {
            max = Math.max(A + (A - 1), A + B);
        } else if (A < B) {
            max = Math.max(B + (B - 1), A + B);
        }
        System.out.println(max);
    }
}