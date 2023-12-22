import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<String> set = new HashSet<>();
        String preString = null;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            if(!set.contains(s) && (preString == null || preString.charAt(preString.length()-1) == s.charAt(0))) {
                set.add(s);
                preString = s;
            }
            else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
