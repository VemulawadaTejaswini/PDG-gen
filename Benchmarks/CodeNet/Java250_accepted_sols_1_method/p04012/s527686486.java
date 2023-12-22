import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
        	char ch = s.charAt(i);
        	freq[ch - 'a']++;
        }

        for(int i = 0; i < freq.length; i++) {
            if(freq[i] % 2 != 0) {
                System.out.println("No");
                return;
            }
        }
		
        System.out.println("Yes");
    }
}