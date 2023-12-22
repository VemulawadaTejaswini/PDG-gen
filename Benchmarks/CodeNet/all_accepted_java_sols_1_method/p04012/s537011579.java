import java.util.*;
import java.io.*;

public class Main{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String s= scanner.next();
        boolean bool = true;
        List<Character> list = new ArrayList<>();
        
        for(int i=0;i<s.length();i++)
        list.add(s.charAt(i));
        
        int [] arr = new int[26];
        
        Collections.sort(list);
        
        char temp = list.get(0);
        int counter=0;
        
         for(int i=0;i<s.length();i++)
         {
             
             int index =(int)(s.charAt(i)-'a');
             
             arr[index]++;
             
         }
         
          for(int i=0;i<26;i++)
          {
              if(arr[i]%2!=0)
              {
                  bool = false;
                  break;
              }
          }
             
           if(bool)
            System.out.println("Yes");
           else
         System.out.println("No");
       
        
        //for(int i=0;i<n;i++)
        
        //System.out.println();
     }
}