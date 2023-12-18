import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[26];
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            for(int i = 0; i < s.length(); i++) {
                char c = Character.toLowerCase(s.charAt(i));
                if('a' <= c && c <= 'z')
                    a[c - 'a']++;
            }
        }

        for(int i = 0; i < 26; i++)
            System.out.println((char)((int)'a' + i) + " : " + a[i]);
    }
}

