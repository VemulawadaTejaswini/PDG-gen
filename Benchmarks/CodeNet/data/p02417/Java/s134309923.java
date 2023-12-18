import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] count = new int[26];
        
        for (int i : count) {
            i = 0;
        }
        
        while (sc.hasNext()) {
            String s = sc.next();
            s = s.toLowerCase();
            char[] c = s.toCharArray();
            
            for (char a : c) {
                count[a-1]++;
            }
        }
        
        for (int i = 'a'; i <= 26; i++) {
            System.out.println((char) i + " : " + count[i - 1]);
        }
    }
}

