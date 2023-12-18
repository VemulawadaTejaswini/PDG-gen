import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        while(true) {
            String str = stdIn.next();
            if(str.equals("-")) {
                break;
            }
            int m = stdIn.nextInt();
            for(int i = 0; i < m; i++) {
                int length = stdIn.nextInt();
                str = str.substring(length) + str.substring(0, length);
            }
            System.out.println(str);

        }
    }
}
