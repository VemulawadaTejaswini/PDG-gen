import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        boolean is1 = A == B;
        boolean is2 = B == C;
        boolean is3 = C == A;

        if (is1 && !is2 && !is3) {
            System.out.println("Yes");
        } else if (!is1 && !is2 && is3) {
            System.out.println("Yes");
        } else if (!is1 && is2 && !is3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}