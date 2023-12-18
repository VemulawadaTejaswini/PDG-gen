import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int c[]=new int[26];
        for(int i=0;i<26;i++)c[i]=0; 
        while(s.hasNext()){
            String str=s.nextLine();
            for(int i=0;i<str.length();i++){
                char temp=Character.toLowerCase(str.charAt(i));
                if(!('a'<= temp&&temp<='z'))continue;
                c[temp-'a']++;
            }
        }
        for(int i=0;i<26;i++)System.out.println((char)('a'+i)+" : "+c[i]);
    }
}