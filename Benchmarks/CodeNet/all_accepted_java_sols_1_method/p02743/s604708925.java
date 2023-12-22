import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		 long a =scn.nextLong();
		 long b =scn.nextLong();
		 long c = scn.nextLong();
		  
		  if((a+b)>=c){
			  System.out.println("No");
			  return;
		  }
		  long val1 =4*(a*b);
		  long val2 = c-(a+b);
		  val2*=val2;
		  
		  
		  if(val1<val2){
			  System.out.println("Yes");
		  }else{
			  System.out.println("No");
		  }
		  
		  

	}

}