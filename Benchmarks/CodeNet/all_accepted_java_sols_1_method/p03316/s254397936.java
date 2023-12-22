import java.util.*;

public class Main{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String  s = sc.next();
   char[] leader = s.toCharArray();
   int N = Integer.parseInt(s);
   int sum = 0;
   for(int i = 0; i < leader.length; i++){
     sum = sum + Character.getNumericValue(leader[i]);
   }
   if(N % sum == 0){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }
 }
}
