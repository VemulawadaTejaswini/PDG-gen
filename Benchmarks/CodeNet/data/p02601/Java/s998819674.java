import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        while(a >= b) {
            b *= 2;
            count++;
            if(count > k) {
                System.out.println("No");
                return;
            }
        }

        while(b >= c){
            c *= 2;
            count++;
            if(count > k) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
