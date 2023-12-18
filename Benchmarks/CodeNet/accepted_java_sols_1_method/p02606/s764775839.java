import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int l =scn.nextInt();
		int r =scn.nextInt();
		int d = scn.nextInt();
	     int val = l/d;
	     if(l%d!=0){
	    	 val++;
	     }
	     int count=0;
	     while(val*d<=r){
	    	 val++;
	    	 count++;
	     }
		
		System.out.println(count);

	}

}