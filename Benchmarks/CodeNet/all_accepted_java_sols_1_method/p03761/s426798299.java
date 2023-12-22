import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        int[] curFreq = new int[26];

        String s = "";
        for(int i = 0; i < n; i++) {
          s = sc.next();
          Arrays.fill(curFreq, 0);
          
          for(int c = 0; c < s.length(); c++)
            curFreq[s.charAt(c) - 'a']++;

          for(int k = 0; k < curFreq.length; k++)
            minFreq[k] = Math.min(minFreq[k], curFreq[k]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < minFreq.length; i++) {
          while(minFreq[i] > 0) {
            sb.append((char)(i + 'a'));
            minFreq[i]--;
          }
        }
        System.out.println(sb.toString());
    }
}
