import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            switch (i) {
                case 2:
                    System.out.print('1');
                    break;
                case 3:
                    System.out.print('8');
                    break;
                default:
                    System.out.print(s.charAt(i));
                    break;
            }
        }
    }
}
