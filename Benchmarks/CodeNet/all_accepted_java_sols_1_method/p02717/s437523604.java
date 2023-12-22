import java.util.Scanner;
import java.util.StringJoiner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String y = scanner.next();
        String z = scanner.next();
        String result = String.join(" ", z, x, y);
        System.out.println(result);
    }
}