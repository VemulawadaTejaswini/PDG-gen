import java.util.Arrays;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	     int k = in.nextInt();
	     int t = in.nextInt();

	     int arr[] = new int[t];
	     for(int i=0;i<t;i++)
	    	 arr[i]=in.nextInt();
	     
	     
	     Arrays.sort(arr);
	     int step =0;
	     int ans=0;
	     while(step<k){
	    	 int get = 0;
	    	 for(int i=arr.length-1;i>=0;i--){
	    		 if(arr[i]>0){
	    			 get++;
	    			 arr[i]--;
	    		 }
	    		 if(get==2)
	    			 break;
	    	 }
	    	 step+=get;
	    	 if(get==1 && step!=k)
	    		 ans++;
	     }
    		 System.out.println(ans);
    	 
	}

}
