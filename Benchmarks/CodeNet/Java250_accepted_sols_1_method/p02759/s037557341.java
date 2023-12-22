import java.util.Scanner;

public class Main {

    public static void main(String [] commandLineArgument){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Long answer = (long)(Math.ceil((double)n/2));
        System.out.println(answer);
		input.close();
    }
}
