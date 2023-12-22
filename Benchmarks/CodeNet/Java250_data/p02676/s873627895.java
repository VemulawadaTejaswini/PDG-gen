import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        String h = sc.nextLine();
        String s = sc.nextLine();
        int k = Integer.parseInt(h);
        int len = String.valueOf( s ).length();
        if (len <= k) {
            System.out.println(s);
        } else {
            for (int i = 0; i < k; i++) {
                System.out.print(s.charAt(i));
            }
            System.out.print("...");
        }
        
    }
}
