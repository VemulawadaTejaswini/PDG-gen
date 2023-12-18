import java.util.Scanner;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ans = new int[26];
        for (int i=0;i<26;i++) ans[i]=0;
        
        while (sc.hasNext()){
            String str = sc.nextLine();
            str = str.toLowerCase();
            for (int i=0;i<str.length();i++){
                char c = str.charAt(i);
                if(c>='a'&&c<='z'){
                    ans[c-'a']++;
                }
            }
        }
        
        for (int i=0;i<26;i++){
            System.out.println((char)('a'+ i) + " : " + ans[i]);
        }
    }
}