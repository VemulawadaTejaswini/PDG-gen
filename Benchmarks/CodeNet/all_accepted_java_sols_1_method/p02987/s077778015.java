import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] c = new int[26];
        for (int i=0;i<s.length();i++)c[s.charAt(i)-'A']++;
        boolean b = true;
        for (int i=0;i<26;i++)if (c[i]!=0&&c[i]!=2)b=false;
        if (b)System.out.println("Yes");
        else System.out.println("No");
    }
}
