
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int cnt[] = new int[26];
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<26; i++)
        {
            cnt[i]=0;
        }
        char ch;
        while(scan.hasNext())
        {
            String text = scan.next();
            for(int i=0; i<text.length(); i++)
            {
                ch=text.charAt(i);
                int n=(ch-'A')%32;
                cnt[n]++;
            }
        }
        for(int i=0; i<26; i++)
        {
            System.out.println(alphabet.charAt(i)+" : "+cnt[i]);
        }
        scan.close();

    }
}