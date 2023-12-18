import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        HashSet<Integer> rem = new HashSet<>();
        long ans = 0;
        int def = 7%k;
        while ((!rem.contains(def))&&(!rem.contains(0))){
            rem.add(def);
            def = (def*10+7)%k;
            ans++;
        }
        if (rem.contains(0))System.out.println(ans);
        else System.out.println(-1);
    }
}
