import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int result = b;
        if(a<=5) {
            result = 0;
        }
        else if(a<=12) {
            result = b/2;
        }
        System.out.println(result);
    }
}
