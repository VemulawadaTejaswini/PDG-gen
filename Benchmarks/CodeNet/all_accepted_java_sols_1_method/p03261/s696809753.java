import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> w = new ArrayList<String>(n);
        for(int i = 0; i < n; i++){
            w.add(sc.next());
        }
        List<String> x = new ArrayList<String>(new HashSet<>(w));
        boolean bre = false;
        for(int i = 0; i < n - 1; i++){
            if (w.get(i).charAt(w.get(i).length() - 1) != w.get(i + 1).charAt(0)) {
                bre = true;
                break;
            }
        }
        if (bre || w.size() != x.size()) {
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}