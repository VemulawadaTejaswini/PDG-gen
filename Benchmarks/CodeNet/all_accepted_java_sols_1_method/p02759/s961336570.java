import java.util.*;
class Main{
public static void main (String[] args){
 Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = a / 2;
    int c = a % 2;
   if(c == 1){
     b = b + 1;
   }
   System.out.println(b);  
  
  }
}