import java.util.*;
import java.io.*;


public class Main{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        
        char[] c= s1.toCharArray();
        List<Integer> list = new ArrayList<>();
        
        
        for(int i=0;i<s1.length();i++)
        {
            if(c[i]!='B')
            list.add((int)c[i]-'0');
            
            else{
                if(list.size()>0)
            list.remove(list.size()-1);
            }
            
            
            
        }
        
        
         for(int i=0;i<list.size();i++)
         System.out.print(list.get(i));
        
        
        
        
        
        
        //System.out.println()
        //for(int i=0;i<n;i++)
     }
}