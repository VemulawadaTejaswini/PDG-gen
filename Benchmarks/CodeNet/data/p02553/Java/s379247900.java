import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
	    Scanner sc=new Scanner(System.in);
	    int[] arr=new int[4];
	    for(int i=0;i<4;i++) {
	    	arr[i]=sc.nextInt();
	    }
		long val1=arr[0]*1l*arr[2];
		long val2=arr[0]*1l*arr[3];
		long val3=arr[1]*1l*arr[2];
		long val4=arr[1]*1l*arr[3];
		System.out.println(Math.max(Math.max(val1, val2), Math.max(val3, val4)));
	}
}