import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String line = sc.nextLine();
            if(line.equals("-")) {
                break;
            }
            String line1 = sc.nextLine();
            int m = Integer.parseInt(line1);
            String ans = line;
            for(int i = 0; i < m; i++) {
                String line2 = sc.nextLine();
                int h = Integer.parseInt(line2);
                String add = ans.substring(0, h);
                ans = ans.substring(h, ans.length());
                ans += add;
            }
            System.out.println(ans);
        }
    }
 }
