import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);        
        int[] ct = new int[26];
        while(sc.hasNext()) {
            String str = sc.nextLine();            
            for(int i = 0; i < str.length(); i++) {
            	char c = str.charAt(i);
                if ('a' <= c && c <= 'z')
                    ct[c-'a']++;
                else if ('A' <= c && c <= 'Z')
                    ct[c-'A']++;
            }
        }
        for(int i = 0; i < 26; i++) {
            System.out.println((char)('a'+i) + " : " + ct[i]);
        }
    }
}

