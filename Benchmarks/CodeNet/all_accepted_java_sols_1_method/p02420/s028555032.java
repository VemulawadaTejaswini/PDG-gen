import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            String s = scan.nextLine();
            if(s.equals("-"))break;
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                int h = scan.nextInt();
                //System.out.println(s);
                s = s.substring(h, s.length()) + s.substring(0, h);
                //System.out.println(s);
            }
            System.out.println(s);
            scan.nextLine();
        }
    }
}

