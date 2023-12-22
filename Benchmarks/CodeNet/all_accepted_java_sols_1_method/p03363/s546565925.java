import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        long [] s = new long [N + 1];

        for (int i = 1; i <= N; i++) {
            s[i] = sc.nextInt(); 
            s[i] += s[i-1]; 
        }

        Arrays.sort(s);
        long cnt = 1;
        long total = 0;
        long prev = s[0];
        for (int i = 1; i <= N; i++){
            if (prev == s[i]) {
                cnt++;
            } else {
                prev = s[i];
                total += cnt * (cnt - 1) / 2;
                cnt = 1;
            }
        }
        total += cnt * (cnt - 1) / 2;
       System.out.println(total);
    }
}