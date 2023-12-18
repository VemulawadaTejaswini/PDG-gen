import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 50; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a == -1 && b == -1 && c == -1) {
                break;
            }
            if(a == -1 || b == -1) {
                System.out.println("F");
                continue;
            }
            if(a + b >= 80) {
                System.out.println("A");
                continue;
            }
            if(a + b >= 65) {
                System.out.println("B");
                continue;
            }
            if(a + b >= 50) {
                System.out.println("C");
                continue;
            }
            if(a + b >= 30) {
                if(c >= 50) {
                    System.out.println("C");
                    continue;
                } else {
                    System.out.println("D");
                    continue;
                }
            }
            System.out.println("F");
            continue;
        }
    }
}
