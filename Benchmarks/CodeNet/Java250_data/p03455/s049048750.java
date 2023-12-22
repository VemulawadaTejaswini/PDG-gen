import java.util.Scanner;

public class Main{

    public static void main(String args[])throws Exception{

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if ((A*B)%2 != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
