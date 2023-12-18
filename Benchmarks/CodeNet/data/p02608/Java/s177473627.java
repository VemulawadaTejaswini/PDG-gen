import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn =new Scanner(System.in);
		int n =scn.nextInt();
	    int []arr =new int[n+1];
	     for(int i=1;i<=100;i++){
	    	 for(int j=1;j<=100;j++){
	    		 for(int k=1;k<=100;k++){
	    			 int ans = res(i,j,k);
	    			 if(ans<arr.length){
	    				 arr[ans]++;
	    			 }
	    		 }
	    	 }
	     }
	     StringBuilder sb=new StringBuilder();
	     for(int i=1;i<=n;i++){
	    	 sb.append(arr[i]+"\n");
	     }
	     System.out.println(sb);
		
//		 
	}
	public static int res(int x ,int y ,int z){
		return x*x+y*y+z*z+z*y+x*y+x*z;
	}

}