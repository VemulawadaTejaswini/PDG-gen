import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt[] = new int[26];
        char a;
        while(sc.hasNext()){
            String S = sc.next();
            for(int i=0; i<S.length(); i++){
                if(S.charAt(i)-'a'>=0 && S.charAt(i)-'a'<26) cnt[S.charAt(i)-'a']++;
                else if(S.charAt(i)-'A'>=0 && S.charAt(i)-'A'<26) cnt[S.charAt(i)-'A']++;
            }
        }
        for(int i=0; i<26; i++){
            a = (char)('a' + i);
            System.out.printf("%s : %d\n", a, cnt[i]);
        }
    }
}
