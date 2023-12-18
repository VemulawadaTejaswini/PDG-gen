import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.next();
            if (str.equals("-")){
            	break;
            }
            int n = scan.nextInt();
            for (int i = 0; i < n; ++i) {
                int h = scan.nextInt();
                str = str.substring(h, str.length()) + str.substring(0, h);
            }
            System.out.println(str);
        }
    }
}