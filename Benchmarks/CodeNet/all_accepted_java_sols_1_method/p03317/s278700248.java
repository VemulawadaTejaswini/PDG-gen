import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int B = sc.nextInt();
   
   if((A-1)%(B-1)==0) System.out.println((A-1)/(B-1));
   else System.out.println(((A-1)/(B-1))+1);
 }
}