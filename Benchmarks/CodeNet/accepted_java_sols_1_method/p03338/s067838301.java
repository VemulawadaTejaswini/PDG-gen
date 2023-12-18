import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        String x = "";
        String y = "";
        int max = 0;
        for(int i=1; i <= N-1; i++) {
            x = S.substring(0, i);
            y = S.substring(i, N);
            List<String> l = new ArrayList<>();
            String[] xs = x.split("");
            String[] ys = y.split("");
            int count = 0;
            for(String s : xs) {
                if(l.contains(s)) continue;
                else l.add(s);
            }
            for(String s : ys) {
                if(l.contains(s)) count++; l.remove(s);
            }
            if(max < count) {
                max = count;
            }
        }
        System.out.println(max);
    }
}