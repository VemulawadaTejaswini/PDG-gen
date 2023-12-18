import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int x = sc.nextInt();
   int y = sc.nextInt();

   int[] re = {9,1,8,1,0,1,0,1,1,0,1,0,1,0,1};
   
   if(re[x] == re[y]) System.out.println("Yes");
   else System.out.println("No");
 }
}