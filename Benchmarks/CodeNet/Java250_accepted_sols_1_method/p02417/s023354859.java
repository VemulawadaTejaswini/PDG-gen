import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     
        String str;

        int[] num = new int[26];
        
        while((str = br.readLine()) !=null){
            for(int i=0;i<str.length();i++){
                char cc = str.charAt(i);
                cc = Character.toLowerCase(cc);
                //System.out.println(cc);
                char x = 'a';
                for(int j=0;j<26;j++){
                    if( x == cc){
                        num[j] +=1;
                    }
                    x++;
                }
            }
        }
        
        char x = 'a';
        for(int i=0;i<26;i++){
            System.out.println(x + " : " + num[i]);
            x++;
        }                    
    }
}