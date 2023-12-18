import static java.lang.System.out;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        String[] numbers = num.split("");
        int ans = 0;
        while (!numbers[0].equals("0")) {
            for (String n : numbers) {
                ans += Integer.parseInt(n);
            }
            out.println(ans);
            num = scan.next();
            numbers = num.split("");
            ans = 0;
        }
    }   
}      