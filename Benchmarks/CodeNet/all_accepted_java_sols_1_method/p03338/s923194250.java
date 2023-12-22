import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String str = sc.next();
        int max = 0;
        for(int i = 1; i<N; i++) {
            String a = str.substring(0,i);
            String b = str.substring(i,N);
            int cnt = 0;
            HashSet<Character> set = new HashSet<Character>();
            for(int j = 0; j<a.length(); j++) {
                for(int k = 0; k<b.length(); k++) {
                    if((a.charAt(j) == b.charAt(k)) && !set.contains(b.charAt(k))) {
                        cnt++;
                        set.add(b.charAt(k));
                    }
                }
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}