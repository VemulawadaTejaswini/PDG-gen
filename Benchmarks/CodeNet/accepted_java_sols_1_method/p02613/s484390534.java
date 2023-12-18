import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String S = sc.next();
            map.put(S,map.getOrDefault(S,0)+1);
        }

        StringBuilder ans = new StringBuilder();
        ans.append("AC x ").append(map.getOrDefault("AC",0)).append('\n');
        ans.append("WA x ").append(map.getOrDefault("WA",0)).append('\n');
        ans.append("TLE x ").append(map.getOrDefault("TLE",0)).append('\n');
        ans.append("RE x ").append(map.getOrDefault("RE",0)).append('\n');

        System.out.print(ans);
    }
}
