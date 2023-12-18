import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int win = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'o') win++;
        }

        if(15 - s.length() + win >= 8) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    } 
}