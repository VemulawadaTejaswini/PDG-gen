import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        for(int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i), i+1) != t.indexOf(t.charAt(i), i+1)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}