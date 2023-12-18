import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result[] = new int[26];
        for(int i = 0 ; i < 26 ; i++)
            result[i] = 0;
        while(sc.hasNext())
        {
            String str = sc.next();
            str = str.toLowerCase();
            for(int i = 0 ; i < str.length() ; i++)
            {
                char c = str.charAt(i);
                if(c >= 'a' && c <= 'z')
                    result[c - 'a']++;
            }
        }
        for(char ch = 'a' ; ch <= 'z' ; ch++)
        {
            System.out.println(ch + " : " + result[ch - 'a']);
        }
    }
}
