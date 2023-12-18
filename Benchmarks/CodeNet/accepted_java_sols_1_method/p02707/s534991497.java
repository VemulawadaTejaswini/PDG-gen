import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int [] arr =new int[n-1];
	     for(int i=0;i<arr.length;i++){
	    	 arr[i]=scn.nextInt();
	    	 
	     }
	     int [] res= new int[n];
	     for(int i=0;i<arr.length;i++){
	    	 res[arr[i]-1]++;
	     }
	     for(int i=0;i<res.length;i++){
	    	 System.out.println(res[i]);
	     }

	}

}