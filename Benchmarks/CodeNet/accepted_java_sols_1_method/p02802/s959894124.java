import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Integer, Map<String,Integer>> submit = new TreeMap<>();
        for (int i = 1; i <= N; i++){
            submit.put(i, new HashMap<>());
            submit.get(i).put("AC",0);
            submit.get(i).put("WA",0);
        }

        int M = sc.nextInt();
        int AC = 0;
        int WA = 0;
        for (int i = 0; i < M; i++){
            int p = sc.nextInt();
            String S = sc.next();
            if (submit.get(p).get("AC") == 0) {
                if (S.equals("AC")) {
                    submit.get(p).put("AC", 1);
                    AC++;
                    WA += submit.get(p).get("WA");
                } else {
                    int count = submit.get(p).get("WA");
                    submit.get(p).put("WA", count + 1);
                }
            }
        }
        System.out.print(AC + " " + WA);
    }
}
