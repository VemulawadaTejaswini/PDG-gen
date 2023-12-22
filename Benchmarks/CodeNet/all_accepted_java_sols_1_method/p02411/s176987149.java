import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();

            if (m == -1 && f == -1 && r == -1) {
                break;
            }

            int t;
            t = m + f;
            if(m==-1 || f==-1){
                System.out.println("F");
        }else if (t >= 80) {
                System.out.println("A");
            } else if (t >= 65 && t < 80) {
                System.out.println("B");
            } else if (t >= 50 && t < 65 || r >= 50) {
                System.out.println("C");
            } else if (t >= 30 ) {
                System.out.println("D");
            }else if(r>=50){
                System.out.println("C");
                } else if (t < 30 ) {
                System.out.println("F");
            }
        }
    }
}

