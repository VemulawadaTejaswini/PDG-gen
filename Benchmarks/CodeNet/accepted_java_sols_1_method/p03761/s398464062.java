import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        for(int i = 0; i < n; i++) {
            strings[i] = sc.next();
        }
        int[] count = new int[26];
        String str = strings[0];
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            count[c - 'a']++;
        }
        int[] tempCount = new int[26];
        for(int i = 1; i < n; i++) {
            str = strings[i];
            for(int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                tempCount[c - 'a']++;
            }
            for(int k = 0; k < 26; k++) {
                int minCount = Math.min(count[k], tempCount[k]);
                count[k] = minCount;
            }
            Arrays.fill(tempCount, 0);
        }
        for(int i = 0; i < 26; i++) {
            int num = count[i];
            while(num != 0) {
                System.out.print(Character.toChars('a' + i));
                num--;
            }
        }
        System.out.println();
    }
}
