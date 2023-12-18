import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] s = new String[n];
        HashMap<String, String> h = new HashMap<String, String>();
        for(int i=0; i<n; i++) {
            s[i] = sc.nextLine();
            h.put(s[i], "a");
        }
        int ans = h.size();
        System.out.println(ans);
    }
}
