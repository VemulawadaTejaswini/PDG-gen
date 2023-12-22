import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int [] cnt = new int[26];
        while(sc.hasNext()) {
            char [] cs = sc.nextLine().toCharArray();
            for(int i = 0; i < cs.length; i++) {
                if(cs[i] >= 'A' && cs[i] <= 'Z') {
                    cnt[cs[i]-'A']++;
                }
                if(cs[i] >= 'a' && cs[i] <= 'z') {
                    cnt[cs[i]-'a']++;
                }
            }
        }
        for(int i = 0; i < 26; i++) {
            System.out.println("" + ((char)(i+'a')) + " : " + cnt[i]);
        }
    }
}