import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char c = str.charAt(0);
        boolean same = true;
        for(int i = 1 ; i < 3 ; i++) {
            if (str.charAt(i) != c) {
                same = false;
            }
        }

        System.out.println(!same? "Yes" : "No");
    }
}
