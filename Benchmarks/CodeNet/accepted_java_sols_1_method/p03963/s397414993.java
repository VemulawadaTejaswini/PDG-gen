import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   long L = sc.nextLong();
   long ans =L;
 
   for(int i=1;i<N;i++) ans*=L-1;
   System.out.println(ans);
 }
}