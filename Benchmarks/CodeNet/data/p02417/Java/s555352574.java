import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] cnt = countChar(scn.nextLine());
        for(int i = 0; i < 26; i++) {
            System.out.println((char)('a' + i) + " : " + cnt[i]);
        }
    }
    
    private static int[] countChar(String str) {
        int[] cnt = new int[26];
        for(char elm : str.toLowerCase().toCharArray()) {
            if(Character.isAlphabetic(elm)) {
                cnt[elm - 'a']++;
            }
        }
        return cnt;
    }
}