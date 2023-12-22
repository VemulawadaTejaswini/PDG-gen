import java.io.*;
import  java.util.*;
import static java.lang.System.in;

public class Main{
    static int n,m;
    static long[] head,pos;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        //String[] buf = reader.readLine().split(" ");
        char[] s = sc.next().toCharArray();
        char[] di = new char[]{'A','C','G','T'};
        HashSet<Character> dic = new HashSet<>();
        for(char w:di) dic.add(w);
        int ans = 0;
        for(int i=0;i<s.length;i++){
            if(!dic.contains(s[i])) continue;
            int j = i+1;
            while(j<s.length&&dic.contains(s[j])) j++;
            ans = Math.max(ans,j-i);
        }
        System.out.println(ans);
    }
}
