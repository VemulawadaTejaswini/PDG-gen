import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String S = sc.next();
   String Ss = S.substring(0,4)+S.substring(5,7)+S.substring(8,10);
   int day = Integer.parseInt(Ss);
   if(day<=20190430) System.out.println("Heisei");
   else System.out.println("TBD");
 }
}