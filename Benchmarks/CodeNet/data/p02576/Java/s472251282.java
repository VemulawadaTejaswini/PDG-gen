
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOf = input.nextInt();
        int numberAtATime = input.nextInt();
        double timeToMake = input.nextInt();
        double result;


        result = timeToMake * Math.ceil(numberOf / numberAtATime);
        

            System.out.println((int)result);
       
    }
}
