import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   Integer[] not = {1,2,3,5,6,9,10,13,17};
   if(Arrays.asList(not).contains(A)) System.out.println("No");
   else System.out.println("Yes");
 }
}