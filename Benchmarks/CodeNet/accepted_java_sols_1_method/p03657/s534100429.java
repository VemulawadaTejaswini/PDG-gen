import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int s1 = sc.nextInt();
   int s2 = sc.nextInt();
   if(s1%3==0||s2%3==0||(s1+s2)%3==0)System.out.println("Possible");
   else System.out.println("Impossible");
 }
}