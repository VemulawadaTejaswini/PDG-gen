import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		while(n>0){
	     int val = n%10;
	     if(val==7){
	    	 System.out.println("Yes");
	    	 return;
	     }
	     n/=10;
		}
System.out.println("No");
	}

}