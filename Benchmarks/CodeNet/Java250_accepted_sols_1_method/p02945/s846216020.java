import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int plus = A + B;
        int minus = A - B;
        int multi = A * B;

        int max = Math.max(plus,Math.max(minus,multi));
        System.out.println(max);
    }
}