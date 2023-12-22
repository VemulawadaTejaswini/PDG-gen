import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      String[] sArr;
      int[] iArr = new int[3];
      
      
      while(n > 0){
         sArr = sc.nextLine().split(" ");
         iArr[0] = Integer.parseInt(sArr[0]);
         iArr[1] = Integer.parseInt(sArr[1]);
         iArr[2] = Integer.parseInt(sArr[2]);
         
         Arrays.sort(iArr);
         
         if(Math.pow(iArr[2], 2) == Math.pow(iArr[0],2) + Math.pow(iArr[1],2)){
            System.out.println("YES");
         }else{
            System.out.println("NO");
         }
         n--;
      }
   }//main
}//class
