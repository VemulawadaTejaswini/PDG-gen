import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ans = new ArrayList<String>();
        if (n % 2 == 0) {
            for (int i = 1; i < n; i++) {
                for (int j = i+1; j <= n; j++) {
                    if (j == n+1-i) continue;
                    String tmp = i + " " + j;
                    ans.add(tmp);
                }
            }
        } else {
            for (int i = 1; i < n; i++) {
                for (int j = i+1; j <= n; j++) {
                    if (j == n-i) continue;
                    String tmp = i + " " + j;
                    ans.add(tmp);
                }
            }
        }
        
        System.out.println(ans.size());
        for (String s : ans) {
            System.out.println(s);
        }
    }
}
