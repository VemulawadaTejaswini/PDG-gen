import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sc.close();

        int ans = t.length();
        int maxMatchCnt = 0;
        for(int i=0; i<s.length()-t.length(); i++) {
            int matchCnt = 0;
            for(int j=0; j<t.length(); j++) {
                if(s.charAt(i+j) == t.charAt(j)) {
                    matchCnt++;
                    maxMatchCnt = Math.max(maxMatchCnt, matchCnt);
                }
            }
        }
        System.out.println(t.length()-maxMatchCnt);
    }
}
