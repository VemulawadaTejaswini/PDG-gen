import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c11 = sc.nextInt();
        int c12 = sc.nextInt();
        int c13 = sc.nextInt();
        int c21 = sc.nextInt();
        int c22 = sc.nextInt();
        int c23 = sc.nextInt();
        int c31 = sc.nextInt();
        int c32 = sc.nextInt();
        int c33 = sc.nextInt();
        
        int diff21 = c21 - c11;
        int diff31 = c31 - c11;
        
        if (c22 - c12 == diff21 && c23 - c13 == diff21 &&
            c32 - c12 == diff31 && c33 - c13 == diff31) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}