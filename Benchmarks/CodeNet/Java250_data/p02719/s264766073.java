import java.util.Scanner;

public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   long A = sc.nextLong();
   long B = sc.nextLong();
   long sum = A;
   long ans1 = 0;
   long ans2 = 0;

   boolean flag = true;
   if(A % B == 0) {
	   flag = false;
   }else {
	 sum = A % B;
   }

   if(flag == true) {
   ans1 = sum;
   ans2 = B - sum;
   }

   if(ans1 < ans2) {
   System.out.print(ans1);
   }else {
   System.out.print(ans2);
   }
   }
}


