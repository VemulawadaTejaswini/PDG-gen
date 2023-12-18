import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i]=in.next();
        }
        Arrays.sort(s);
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st.append(s[i]);
        }
        System.out.println(st);
    }
    
}
