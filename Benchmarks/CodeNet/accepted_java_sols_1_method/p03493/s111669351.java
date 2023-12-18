import java.util.Scanner;
public class Main{
	public static void main(String[] args) {


    Scanner sc =new Scanner(System.in);
   int a = sc.nextInt();
   if(a>=100) {
	   if(a%100==11) {
		   System.out.println(3);

	   }
	   else if(a%100==1) {
		   System.out.println(2);
	   }
	   else if(a%100==10) {System.out.println(2);}
		   else {System.out.println(1);}

	   }

   else if(a>=10) {
	   if(a%10==1) {System.out.println(2);}
	   else {System.out.println(1);}


   }
   else if(a>=1) {System.out.println(1);}
   else {System.out.println(0);}
	}

}
