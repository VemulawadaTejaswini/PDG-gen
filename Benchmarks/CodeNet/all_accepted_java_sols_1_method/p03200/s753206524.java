import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] bcount = new int[s.length()+1];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='B') {
                bcount[i]++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            bcount[i+1] += bcount[i];
        }
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='W') {
                ans += (long)bcount[i];
            }
        }
        System.out.println(ans);
    }
}