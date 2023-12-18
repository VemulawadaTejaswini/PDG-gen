import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   if (checkByNine(n)&&checkPlusNine(n)){
     System.out.println("YES");
   }else{
     System.out.println("NO");
   }
 }
   
 public static boolean checkByNine(int n){
  boolean result = false;
   if (n%9==0){
    result=true;
   }
   return result;
 }
 
 public static boolean checkPlusNine(int n){
   int sum = 0;
   boolean result=false;
   
   while (n != 0) {
     sum += n % 10;
     n /= 10;
   }
   
   if (sum%9==0){
     result=true;
   }else{
     result=false;
   }
   return result;
 }  
}