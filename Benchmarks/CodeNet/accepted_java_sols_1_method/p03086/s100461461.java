import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String a = s.substring(i, j);
                boolean able = true;
                for (int k = 0; k < a.length(); k++) {
                    if(a.substring(k, k+1).equals("A")) continue;
                    if(a.substring(k, k+1).equals("T")) continue;
                    if(a.substring(k, k+1).equals("C")) continue;
                    if(a.substring(k, k+1).equals("G")) continue;
                    able = false;
                    break;
                }
                if(able) ans = Math.max(ans, a.length());
            }
        }

        System.out.println(ans);
        sc.close();
    }

}
