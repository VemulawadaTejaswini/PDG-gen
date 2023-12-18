import java.util.*;

public class Main{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int[] compare = {a-b, a+b, a*b};
   int max = compare[0];
   for(int i = 1; i < compare.length; i++){
     if(max < compare[i]){
       max = compare[i];
     }
   }
   System.out.println(max);
  }
}