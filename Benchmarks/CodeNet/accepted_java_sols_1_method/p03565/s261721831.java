import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        int sN = s.length;
        int tN = t.length;

        boolean isReplaced = false;
        for(int i = sN - tN;i >= 0;i--) {
            boolean isPossible = true;
            for(int j = 0;j < tN;j++) {
                if(s[i + j] != '?' && s[i + j] != t[j]) {
                    isPossible = false;
                    break;
                }
            }
            if(isPossible) {
                for(int j = 0;j < tN;j++) s[i + j] = t[j];
                isReplaced = true;
                break;
            }
        }
        
        String ans = isReplaced ? String.valueOf(s).replace('?', 'a') : "UNRESTORABLE";
        System.out.println(ans);
    }
}
