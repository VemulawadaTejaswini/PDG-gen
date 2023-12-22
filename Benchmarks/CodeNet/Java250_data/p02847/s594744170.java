import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String S = sc.next();
   int SS = 0;
   if(S.equals("SUN")) SS = 7;
   else if(S.equals("MON")) SS = 6;
   else if(S.equals("TUE")) SS = 5;
   else if(S.equals("WED")) SS = 4;
   else if(S.equals("THU")) SS = 3;
   else if(S.equals("FRI")) SS = 2;
   else if(S.equals("SAT")) SS = 1;
     
   System.out.println(SS);
 }
}