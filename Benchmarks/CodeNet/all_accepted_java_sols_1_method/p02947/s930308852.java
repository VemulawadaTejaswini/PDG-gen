import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] SCA = new char[N][10];
        long cnt = 0;
        Map<String, Long> sMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            SCA[i] = sc.next().toCharArray();
            Arrays.sort(SCA[i]);
            String si = new String(SCA[i]);
            sMap.put(si, sMap.getOrDefault(si, 0L) + 1);
        }

        for (long n : sMap.values())
            cnt += n * (n - 1) / 2;

        System.out.println(cnt);


    }
}