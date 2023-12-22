import java.util.*;
class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = a;
    int d = 0;
    while(b != 0){
    d = d + b % 10;
      b = b / 10;
    }
   if(0 == a % d){
    System.out.println("Yes");
   } else {
   System.out.println("No");
   }
 } 
}