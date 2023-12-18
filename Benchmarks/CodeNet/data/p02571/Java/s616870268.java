import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] Ts = new char[t.length()];
        for(int a = 0; a < t.length(); a++) {
            Ts[a] = t.charAt(a);
        }
        String[] Scut = new String[s.length() - t.length()];
        for(int i = 0; i < s.length() - t.length(); i++) {
            Scut[i] = s.substring(i, i + t.length());
        }
        int count = 0;
        int mostCount = 0;
        for(int j = 0; j < s.length() - t.length(); j++) {
            for(int b = 0; b < t.length(); b++) {
                if(Scut[j].charAt(b) == Ts[b]) {
                    count++;
                }
            }
            if(mostCount < count) {
                mostCount = count;
            }
            count = 0;
        }
        System.out.println(t.length() - mostCount);
	}
}