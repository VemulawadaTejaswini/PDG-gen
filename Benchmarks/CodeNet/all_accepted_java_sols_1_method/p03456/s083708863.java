import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int num = Integer.parseInt(a + b);

        double sqrt = Math.sqrt(num);
        int sqrtInt = (int) sqrt;
        if (sqrt % sqrtInt == 0) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
