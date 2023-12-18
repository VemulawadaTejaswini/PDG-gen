import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
while(true){
        int m = sc.nextInt();
        int f = sc.nextInt();
        int r = sc.nextInt();
        int c;
        c = m + f;
            if (m == -1 && f == -1 && r == -1) {
                break;
            }
            if (m == -1 || f == -1) {
                System.out.println("F");
            }
                else if (c >= 80) {
                System.out.println("A");
            }   else if (c >= 65) {
                System.out.println("B");
            }   else if (c >= 50 || (c < 50 && r >= 50)) {
                System.out.println("C");
            }   else if (c >= 30 && r < 50) {
                System.out.println("D");
            }
                else if (c < 30) {
                System.out.println("F");
                }
        }
    }
}
