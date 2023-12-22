import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int x=2*((int)'5')-(int)c;
            ans+=((char)x);
            
            
        }
      
        System.out.println(ans);
     }
}