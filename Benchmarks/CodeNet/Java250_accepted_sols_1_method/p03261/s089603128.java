import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String[] w = new String[N];
        List<String> l = new ArrayList<>();
        String ans = "Yes";
        w[0] = sc.next();
        l.add(w[0]);
        for(int i=1; i<N; i++) {
            w[i] = sc.next();
            if(l.contains(w[i])) {
                ans = "No";
                break;
            }else if(w[i].charAt(0) != w[i-1].charAt(w[i-1].length()-1)) {
                ans = "No";
                break;
            }else {
                l.add(w[i]);
            }
        }
        System.out.println(ans);
    }
    
}