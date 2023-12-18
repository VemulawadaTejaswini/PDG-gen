import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) throws IOException {
    
    	Scanner scan = new Scanner(System.in);
    	
    	int n = scan.nextInt();
    	int stool = 0;
    	
    	int [] nums = new int[n];
    	
    	for(int i=0; i<n; i++) {
    		int t = scan.nextInt();
    		nums[i] = t;
    	}
    	
    	for(int i=0; i<n-1; i++) {
    		if(nums[i] > nums[i+1]) {
    			int difference = nums[i] - nums[i+1];
    			stool += difference;
    			nums[i+1] = nums[i];
    		}
    	}
    	System.out.println(stool);
    	}
}
