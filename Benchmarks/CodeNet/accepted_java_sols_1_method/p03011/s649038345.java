import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] inputs = input.split(" ");

            int P = Integer.parseInt(inputs[0]);
            int Q = Integer.parseInt(inputs[1]);
            int R = Integer.parseInt(inputs[2]);

            int min1 = Math.min(P,Q);
            int max1 = Math.max(P,Q); 

            if (max1 <=  R) {
                System.out.println(min1 + max1);
            } else {
                System.out.println(min1 + R);
            } 
            
            scanner.close();
    }
}