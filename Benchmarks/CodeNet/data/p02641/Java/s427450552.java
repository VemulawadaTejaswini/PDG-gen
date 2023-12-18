import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int p[] = new int[N];
        Set<Integer> si = new HashSet<>();
        for(int i=0; i<N; i++) {
            p[i] = sc.nextInt();
            si.add(p[i]);
        }
        int result = 0;
        int mindiff = Math.abs(0-X);
        for(int t=0; t<=101; t++) {
            if(si.contains(t)) continue;
            if(mindiff > Math.abs(t-X)) {
                mindiff = Math.abs(t-X);
                result = t;
            }
        }
        System.out.println(result);
    }
}
