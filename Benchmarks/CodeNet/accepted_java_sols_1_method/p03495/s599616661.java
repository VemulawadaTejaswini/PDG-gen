import java.util.*;

/**
 * @author varun on 7/1/2018
 * @project CompetitiveProgramming
 */
public class Main {
    private static int[] freqMap = new int[200000];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int maxNumKeys = scanner.nextInt();
        for (int i = 0; i < N; i++) freqMap[scanner.nextInt()]++;
        Arrays.sort(freqMap);
        int ans = 0;
        for (int i = 0; i < freqMap.length-maxNumKeys; i++) ans += freqMap[i];
        System.out.println(ans);
    }
}
