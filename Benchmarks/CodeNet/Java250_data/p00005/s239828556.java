import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str;
      String[] arr;
      int a;
      int b;
      int gcd;
      int lcm;
         
         
      while(sc.hasNext()){
         str = sc.nextLine();
         arr = str.split(" ");
         Arrays.sort(arr);
         a = Integer.parseInt(arr[0]);
         b = Integer.parseInt(arr[1]);
            
         gcd = Euclid(a,b);
         lcm = LCM(a,b);
         
         
         System.out.println(gcd + " " + lcm);
      }    
   }//main
   
   public static int Euclid(int a, int b){
      int remainder;
      if(a%b == 0){
         return b;
      }else{
         remainder = a%b;
         return Euclid(b,remainder);
      }
   }
   
   public static int LCM(int a, int b){
      int k = 1;
      while(true){
         if((b*k)%a == 0){
            return b*k;
         }else{
            k++;
         }
      }
   }
   
}//class