import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; ; i++) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int s = m + f;
            if(m == -1 && f == -1 && r == -1) break;
            if(m == -1 || f == -1) {
                System.out.println("F");
            } else if(s >= 80) {
                System.out.println("A");
            } else if(s >= 65 && s < 80) {
                System.out.println("B");
            } else if(s >= 50 && s < 65) {
                System.out.println("C");
            } else if(s >= 30 && s < 50) {
                if(r >= 50) {
                    System.out.println("C");
                } else {
                    System.out.println("D");
                }
            } else {
                System.out.println("F");
            }
        }
    }
}
