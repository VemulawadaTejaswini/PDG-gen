import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i=1; i<=x; i++) {
            if(y == (i*2)+((x-i)*4)) {
                System.out.println("Yes");
                return;
            }
        }
        for(int i=1; i<=x; i++) {
            if(y == (i*4)+((x-i)*2)) {
                System.out.println("Yes");
                return;
            }
        }
        for(int i=1; i<=x/2; i++) {
            if(y == i*2) {
                System.out.println("Yes");
                return;
            }
        }
        for(int i=1; i<=x/4; i++) {
            if(y == i*4) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}