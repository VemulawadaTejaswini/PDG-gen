import java.util.Scanner;
class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int a= sc.nextInt();
   int b= sc.nextInt();
   int c= sc.nextInt();
   int d= sc.nextInt();
   boolean flag = true;

   while(flag) {
	   c -= b;
	   if(c<=0) {
		   System.out.println("Yes");
		   flag = false;
		   break;
	   }
	   a -= d;
	   if(a<=0) {
		   System.out.println("No");
		   flag = false;
		   break;
	   }
   }

 }
}