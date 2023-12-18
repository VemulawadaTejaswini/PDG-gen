import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var n = sc.next();

        var ones = n.substring(n.length() - 1);
        String answer;
        switch (ones) {
            case "3":
                answer = "bon";
                break;
            case "2":
            case "4":
            case "5":
            case "7":
            case "9":
                answer = "hon";
                break;
            default:
                answer = "pon";
        }
        var writer = new PrintWriter(System.out);
        writer.println(answer);
        writer.flush();
    }
}
