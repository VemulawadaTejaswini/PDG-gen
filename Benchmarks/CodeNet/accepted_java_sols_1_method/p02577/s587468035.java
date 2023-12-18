import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		 String s =scn.next();
		  long sum=0;
		  for(int i=0;i<s.length();i++){
			  sum+=(s.charAt(i)-'0');
			  sum%=9;
		  }
		  if(sum==0){
			  System.out.println("Yes");
		  }else{
			  System.out.println("No");
		  }

	}

}