import java.util.Scanner;

public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int B = sc.nextInt();
   int C = sc.nextInt();

   if(A == B) {
	   if(B == C) {
		   System.out.print("No");
	   }else {
		   System.out.print("Yes");
	   }
   }else if(A == C) {
	       System.out.print("Yes");
   }else if(B == C) {
           System.out.print("Yes");
   }else {
	   System.out.print("No");

   }

   }

   }

