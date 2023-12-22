import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder s1 = new StringBuilder(s.substring(0,s.length()/2));
        s1.reverse();
        StringBuilder s2;
        if (s.length()%2==0)s2=new StringBuilder(s.substring(s.length()/2));
        else s2 = new StringBuilder(s.substring(s.length()/2+1));
        int ans = 0;
        for (int i=0;i<s1.length();i++)if (s1.charAt(i)!=s2.charAt(i))ans++;
        System.out.println(ans);
    }

}
