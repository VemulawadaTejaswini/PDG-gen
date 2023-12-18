import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<String,Integer> m = new HashMap<>();
        m.put("AC",0);//AC, WA, TLE, RE
        m.put("WA",0);//AC, WA, TLE, RE
        m.put("TLE",0);//AC, WA, TLE, RE
        m.put("RE",0);//AC, WA, TLE, RE

        for (int i = 0; i < N; i++) {
            String S = sc.next();
            m.put(S,m.get(S)+1);
        }
        long ans =0;
        System.out.println("AC x "+m.get("AC"));
        System.out.println("WA x "+m.get("WA"));
        System.out.println("TLE x "+m.get("TLE"));
        System.out.println("RE x "+m.get("RE"));
    }}