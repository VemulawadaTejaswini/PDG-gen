import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int l = 0;
        int r = 0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == '(') l++;
            else if(0 < l) l--;
            else r++;
        }
        for (int i = 0; i < r; i++) {
            s = "(" + s;
        }
        for (int i = 0; i < l; i++) {
            s = s + ")";
        }
        System.out.println(s);
        sc.close();

    }

}
