import java.util.*;

class Main {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int B = sc.nextInt();
   
   int sum = A + B;
   int sub = A - B;
   int mul = A * B;
   
   if(mul > sum) {
    if(mul > sub) {
     System. out.println(mul);
    }else {
     System. out.println(sub);
    }
   }else {
    if(sum > sub){
      System. out.println(sum);
    }else {
      System. out.println(sub); 
    }
   }
 }
}