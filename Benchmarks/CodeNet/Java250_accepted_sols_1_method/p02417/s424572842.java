import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int i,j;
        
        Scanner sc=new Scanner(System.in);
        
        int cnt[]=new int[26];
        
        String str;
        char c;
        while(true){
            try{
               str=sc.next();
               for(i=0;i<str.length();i++){
                   c=str.charAt(i);
                   if(Character.isUpperCase(c))cnt[c-'A']++;
                   else if(Character.isLowerCase(c))cnt[c-'a']++;
               }
            }catch(NoSuchElementException e){
                break;
            }
        }
        c='a';
        for(i=0;i<26;i++){
            System.out.println(c + " : "+ cnt[i]);
            c++;
        }
        
    }
}

