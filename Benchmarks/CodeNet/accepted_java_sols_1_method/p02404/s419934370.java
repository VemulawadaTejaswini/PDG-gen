
import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        for (;;) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0)
                break;
            for (int j = 0; j < a; j++) {
                for (int k = 0; k < b; k++) {
                    if(j==0||j==a-1||k==0||k==b-1)
                        System.out.print("#");
                    else
                        System.out.print(".");
                }
                System.out.println();
            }

            System.out.println();
        }
    }
}

