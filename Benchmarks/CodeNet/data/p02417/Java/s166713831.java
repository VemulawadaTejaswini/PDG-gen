import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] count = new int[26];
        char c;
        String str;
        for (int i = 0; i < 26; i++) 
            count[i] = 0;
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            str = sc.next();
            for(int i = 0; i < str.length(); i++) {
                c = str.charAt(i);
                if (c >= 'A' && c <= 'z') {
                    if (c >= 'a' && c <= 'z') {
                        count[c - 'a']++;
                    } else {
                        count[c - 'A']++;
                    }
                }
            }
        }
        for (int i = 0; i < 26; i++) 
            System.out.println((char)(i + 'a') + " : " + count[i]);
    }
}
