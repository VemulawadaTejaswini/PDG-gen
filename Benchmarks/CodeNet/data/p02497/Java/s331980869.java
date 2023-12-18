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

            if (m == -1 || f == -1) {
                System.out.println("F");
            }
            int A = m + f ;
            if (A >= 65) {
                if (A >= 80) {
                    System.out.println("A");
                }else{
                    System.out.println("B");
                }
            }else if (A >= 30){
                if(A >= 50){
                    System.out.println("C");
                }else if(r >= 50){
                    System.out.println("C");
                }else{
                    System.out.println("D");
                }
            }else{
                System.out.println("F");
            }
        }
    }
}