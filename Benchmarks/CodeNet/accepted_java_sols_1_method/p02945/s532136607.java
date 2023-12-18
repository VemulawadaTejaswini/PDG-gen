
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int max=Integer.MIN_VALUE;
        max=Math.max(max, a+b);
        max=Math.max(max, a-b);
        max=Math.max(max, a*b);
        System.out.println(max);
    }
}
