import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, f, r;

        while(true) {
            m = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();

            if(m == -1&&f == -1&&r ==-1) {
                break;
            }

            if(m == -1||f == -1){
                System.out.println("F");
                continue;
            }
            else if(m + f >= 80) {
                System.out.println("A");
                continue;
            }
            else if(m + f >= 65) {
                System.out.println("B");
                continue;
            }
            else if(m + f >= 50) {
                System.out.println("C");
                continue;
            }
            else if(m + f >= 30) {
                if(r >= 50){
                    System.out.println("C");
                    continue;
                }
                System.out.println("D");
                continue;
            }
            else {
                System.out.println("F");
                continue;
            }
        }
    }
}
