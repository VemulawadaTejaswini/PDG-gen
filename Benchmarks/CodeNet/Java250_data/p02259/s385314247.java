
import java.io.*;
import java.util.*;

public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
    private static StringTokenizer st;

    public static void main ( String [] args ) throws IOException
    {
	new Main().cal();
    }

 
    private void cal() throws IOException 
    {
	int N = Integer.parseInt(br.readLine());
	int [] nums = new int[N];

	st = new StringTokenizer(br.readLine());
	for(int i = 0; i < N; i++)
	    nums[i] = Integer.parseInt(st.nextToken());

	int count = 0;
	for(int i = 0; i < nums.length; i++)
	    for( int j = nums.length-1; j > i; j--) {
		if ( nums[j] < nums[j-1] ) {
		    count++;
		    swap(nums, j, j-1);
		}

	    }
	
	for(int i = 0; i < nums.length; i++){
	    if ( i > 0 ) System.out.print(" ");
	    System.out.print(nums[i]);
	}
	System.out.println("");
	    
	System.out.println(count);
    }

    private void swap(int [] nums, final int i, final int j) {
	int temp = nums[j];
	nums[j] = nums[i];
	nums[i] = temp;
    }

}