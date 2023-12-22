import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int[] x=new int[n];
    	boolean can = true;
    	for(int i=0;i<n;i++)
    		x[i] = sc.nextInt();
    	Arrays.sort(x);
    	for(int i=0;i<n-1;i++) {
    		if(x[i]==x[i+1]) {
    			can = false;
    				break;
    		}
    	}
    	String s = can?"YES":"NO";
    	System.out.println(s);
	}
}