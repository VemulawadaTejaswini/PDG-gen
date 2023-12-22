import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String answer = "No";

        String inputNum = sc.next();

        if(inputNum.matches(".*7.*")) {
            answer = "Yes";
        }

        System.out.println(answer);
        sc.close();
    }
}
