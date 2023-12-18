import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        TreeSet<String> set = new TreeSet<>();
        for (int c = 'a'; c <= 'z'; c++) {
            char ch = (char) c;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ch) {
                    for (int j = i, x = 0; j < s.length() && x <= 6; j++, x++) {
                        set.add(s.substring(i, j + 1));
                    }
                }
            }
            if(set.size()>=k) {
                break;
            }
        }
        int i = 0;
        for (String str : set) {
            if (++i == k) {
                System.out.println(str);
                break;
            }
        }
    }
}
