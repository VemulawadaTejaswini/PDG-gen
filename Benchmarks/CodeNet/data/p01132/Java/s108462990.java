import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
	   try(Scanner sc = new Scanner(System.in)){
		   while(sc.hasNext()) {
			   int num=sc.nextInt();
			   if(num==0) break;
			   int ten=sc.nextInt();
			   int fif=sc.nextInt();
			   int hun=sc.nextInt();
			   int fiv=sc.nextInt();
			   
			   for(int i=fiv; i>0; i--) {
				   num-=num%500;
				   if(num/500==0) {
					   fiv=i-1;
				   }
			   }
			   for(int i=hun; i>0; i--) {
				   num-=num%100;
				   if(num/100==0) {
					   hun=i-1;
				   }
			   }
			   for(int i=fif; i>0; i--) {
				   num-=num%50;
				   if(num/50==0) {
					   fif=i-1;
				   }
			   }
			   for(int i=ten; i>0; i--) {
				   num-=num%10;
				   if(num/10==0) {
					   ten=i-1;
				   }
			   }
			   if(ten>0) {
				   System.out.println("10"+" "+ten);
			   }
			   if(fif>0) {
				   System.out.println("50"+" "+fif);
			   }
			   if(hun>0) {
				   System.out.println("100"+" "+hun);
			   }
			   if(fiv>0) {
				   System.out.println("500"+" "+fiv);
			   }
			   System.out.println();
		   }
		   
		   
       }
   }
}
