import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   int N = sc.nextInt();
   int k = N/15;
 
   System.out.println(N*800-k*200);
 }
}