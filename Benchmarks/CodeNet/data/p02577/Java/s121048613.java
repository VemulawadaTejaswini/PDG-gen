import java.util.*;
class Main{
 public static void main(String args[]){
  Scanner scan=new Scanner(System.in);
   String m=scan.next();
   int sum=0;
   for(int i=0;i<m.length();++i){
     sum+=(int)m.charAt(i)-'48';
   }
   if(sum%9==0){
     System.out.print("YES");
 }
   else
     System.out.print("NO");
 }   
}