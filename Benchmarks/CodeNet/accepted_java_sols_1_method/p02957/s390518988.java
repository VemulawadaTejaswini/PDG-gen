import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        long sum = a+b;
        if(sum%2!=0) {
            System.out.println("IMPOSSIBLE");
        }
        else {
            System.out.println(sum/2);
        }
    }
}
