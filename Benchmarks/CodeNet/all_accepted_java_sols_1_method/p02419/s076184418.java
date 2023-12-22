
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String data, input;
        int ans = 0;
        data = scan.next();
        while (true) {
            input = scan.next();
            if (input.equalsIgnoreCase(data))
                ans++;
            else if (input.equals("END_OF_TEXT"))
                break;
        }
        System.out.println(ans);
    }
}
