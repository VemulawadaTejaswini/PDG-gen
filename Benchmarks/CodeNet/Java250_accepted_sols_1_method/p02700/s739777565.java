import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int restT = A;
        int restA = C;

        while(restT > 0 && restA > 0){
            restA -= B;
            if(restA <= 0){
                System.out.println("Yes");
                break;
            }
            restT -= D;
            if(restT <= 0){
                System.out.println("No");
                break;
            }
        }
    }
}
