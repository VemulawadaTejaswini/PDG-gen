import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            if(a == 0){
                System.out.println("Zero");
                System.exit(0);
            }
            else if(a < 0){
                System.out.println("Negative");
                System.exit(0);
            }
            else{
                System.out.println("Positive");
                System.exit(0);
            }
        }
        else{
            if(a > 0 && b > 0){
                System.out.println("Positive");
                System.exit(0);
            }
            else if(a <= 0 && b >= 0){
                System.out.println("Zero");
                System.exit(0);
            }
            else{
                int sum = - (a + b);
                if(sum%2 == 0){
                    System.out.println("Negative");
                    System.exit(0);
                }
                else{
                    System.out.println("Positive");
                    System.exit(0);
                }
            }
        }
    }
}
