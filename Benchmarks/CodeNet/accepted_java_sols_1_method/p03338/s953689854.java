import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0;
        for (int i=1;i<s.length();i++){
            String s1 = s.substring(0,i);
            String s2 = s.substring(i);
            int ret= 0;
            boolean[] b1 = new boolean[26];
            boolean[] b2 = new boolean[26];
            for (int j=0;j<s1.length();j++){
                b1[s1.charAt(j)-'a']=true;
            }
            for (int j=0;j<s2.length();j++){
                b2[s2.charAt(j)-'a']=true;
            }
            for (int j=0;j<26;j++){
                if (b1[j]&&b2[j])ret++;
            }
            ans = Math.max(ans,ret);
        }
        System.out.println(ans);
    }
}
