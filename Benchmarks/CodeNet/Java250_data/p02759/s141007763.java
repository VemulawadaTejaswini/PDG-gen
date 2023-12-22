import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   double n=0;
   Scanner sc = new Scanner(System.in);
   n=sc.nextInt();
   double x;
   if(n%2==0){
     x=n/2;
   }else{
     x=n/2+0.5;
   }
   int y=(int)x;
   System.out.println(y);
 }
}
