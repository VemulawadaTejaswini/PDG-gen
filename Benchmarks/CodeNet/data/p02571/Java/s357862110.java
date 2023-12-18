import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        String s = sc.next();
        String n = sc.next();
        sc.close();
        int ans = n.length();
        String subn = null;
        int index = 0;
        String work_s = null;
        String work_n = null;
        String work_sb = null;
        String work_nb = null;
        for (int i = 0; i < n.length(); i++) {
            for (int j = i+1; j <= n.length(); j++) {
                subn = n.substring(i, j);
                if (s.contains(subn)) {
                    index = s.indexOf(subn) + 1;
                    work_s = s.substring(0, index);
                    work_n = n.substring(0, i);
                    if (work_s.length() >= work_n.length()) {
                        if (ans > n.length() - subn.length()) {
                            ans = n.length() - subn.length();
                        }
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);

    }
}