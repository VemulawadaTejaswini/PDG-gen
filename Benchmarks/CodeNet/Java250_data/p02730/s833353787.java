import java.util.Scanner;
class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   String s = sc.next();
   int n = s.length();
   String x , y;
   x = s.substring(0,n/2);
   y = s.substring(n/2+1,n);
   if(x.equals(y)){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }
 
 }
}