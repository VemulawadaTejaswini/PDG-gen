import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[26];

        while(sc.hasNext()) {
            String s = sc.nextLine();
            s = s.toLowerCase();
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    a[s.charAt(i) - 'a']++;
                }
            }
        }
        for(char i='a'; i<='z'; i++) {
            System.out.println(i + " : " + a[i-'a']);
        }
    }
}

