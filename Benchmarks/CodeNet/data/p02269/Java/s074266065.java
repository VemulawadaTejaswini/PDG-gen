import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //命令の数
        Set<String> set = new HashSet<String>();
        for(int i=0; i<n; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            if (s1.equals("insert")) {
                set.add(s2);
            } else if (set.contains(s2)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

