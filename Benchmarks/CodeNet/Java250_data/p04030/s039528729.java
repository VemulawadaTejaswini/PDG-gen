import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   char[] c = sc.next().toCharArray();
   
   StringBuilder sb = new StringBuilder();
   for(int i=0;i<c.length;i++)
   {
     if(c[i]=='0') sb.append(0);
     else if(c[i]=='1') sb.append(1);
     else if(c[i]=='B'&&sb.length()!=0) sb.deleteCharAt(sb.length()-1);
   }
   System.out.println(sb.toString());
 }
}