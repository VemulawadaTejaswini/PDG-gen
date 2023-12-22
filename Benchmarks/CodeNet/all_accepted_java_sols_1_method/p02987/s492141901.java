import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] counter = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            counter[c - 'A']++;
        }
        int count = 0;
        for(int i = 0; i < 26; i++) {
            if(counter[i] == 2) count++;
        }
        if(count == 2) System.out.println("Yes");
        else System.out.println("No");
    }
}
