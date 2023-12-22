import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double numberOf = input.nextDouble();
        double numberAtATime = input.nextDouble();
        double timeToMake = input.nextDouble();
        double result;


        result = timeToMake * Math.ceil(numberOf / numberAtATime);
        System.out.println((int)result);

    }
}
