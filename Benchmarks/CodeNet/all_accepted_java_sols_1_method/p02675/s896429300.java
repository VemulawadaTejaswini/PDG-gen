import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int nx = n % 10;
        if (nx == 2 || nx == 4 || nx == 5 || nx == 7 || nx == 9) {
            System.out.println("hon");
        } else if (nx == 0 || nx == 1 || nx == 6 || nx == 8) {
            System.out.println("pon");
        } else if (nx == 3) {
            System.out.println("bon");
        }
    }
}