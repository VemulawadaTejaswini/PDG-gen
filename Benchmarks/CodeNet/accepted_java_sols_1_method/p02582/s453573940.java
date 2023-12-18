import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] s = S.split("");
        int c = 0;
        int max = 0;
        for(int i=0; i<3; i++) {
            if(s[i].equals("R")) {
                c++;
            }else {
                if(max < c) {
                    max = c;
                    c = 0;
                }
            }
        }
        if(c > max) max = c;
        System.out.println(max);
    }
}
