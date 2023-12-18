import static java.lang.System.out;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] numbers = scan.next().split("");
        int m = 0;
        for(String n : numbers) {
            m += Integer.parseInt(n);
        }
        out.println(m);
    }                                                                           
}