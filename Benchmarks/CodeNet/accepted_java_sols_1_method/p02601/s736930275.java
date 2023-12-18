import java.util.*;
 
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();
   
   int k = sc.nextInt();
   
   for(int i = 0;i < k;i++){
    if(b <= a){
      b = 2*b;
    }else if(c <= b){
      c = 2*c;
    }else{
      break;
    }
   }
   
   
   
   if(a < b && b < c){
    System.out.println("Yes");
   }else{
    System.out.println("No");
   }
   
 }
}