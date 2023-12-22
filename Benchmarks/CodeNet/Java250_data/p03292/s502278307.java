import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int B = sc.nextInt();
   int C = sc.nextInt();
   
   int[] si = {Math.abs(A-B),Math.abs(C-B),Math.abs(A-C)};
   Arrays.sort(si);
   
   System.out.println(si[0]+si[1]);
 }
}