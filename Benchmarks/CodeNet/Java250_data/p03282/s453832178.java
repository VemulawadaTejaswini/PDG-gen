import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String N = sc.next();
   long K = sc.nextLong();
   int tmp =0;
   char tmpchar = '1';
   
   while(101>tmp && K>tmp)
   {
     if(N.charAt(tmp)!='1')
     {
       tmpchar = N.charAt(tmp);
       break;
     }
     tmp++;
   }
   
   System.out.println(tmpchar);
 }
}