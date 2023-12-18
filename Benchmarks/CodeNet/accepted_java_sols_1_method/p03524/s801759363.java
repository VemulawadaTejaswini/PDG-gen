import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        int n=s.length();
        int[]a=new int[26];
        for(char c:s.toCharArray())a[c-'a']++;
        for(int i=0;i<26;++i)
            if(a[i]>(n+2)/3){
                System.out.println("NO");
                return;
            }
        System.out.println("YES");
    }
}
