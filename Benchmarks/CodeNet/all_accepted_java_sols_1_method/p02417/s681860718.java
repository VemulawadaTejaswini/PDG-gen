import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alph = new int[26];
        while (true) {
            try {
                String s = sc.next().toLowerCase();
                for (int i=0; i<s.length(); ++i) {
                    int l = s.charAt(i) - 'a';
                    if (l >= 0 && l < 26) {
                        alph[s.charAt(i) - 'a'] += 1;
                    }
                }
            } catch (Exception e) {
                break;
            }
        }
        for (int i=0; i<alph.length; ++i) {
            System.out.printf("%c : %d\n", 'a'+i, alph[i]);
        }
        sc.close();
    }
}

