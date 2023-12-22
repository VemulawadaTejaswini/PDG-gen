import java.util.*;

public class Main {

    public static void main(String [] commandLineArgument){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt() , m = input.nextInt();
        int answer = (m * (m - 1))/2;
        answer += (n * (n - 1))/2;
        System.out.println(answer);
        input.close();

    }

}

