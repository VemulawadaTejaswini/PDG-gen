import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		long val =n;
		long sum=0;
	     for(int i=0;i<3;i++){
	    	 sum+=val;
	    	 val*=n;
	     }
		System.out.println(sum);

	}

}