import java.util.Arrays;
import java.util.Scanner;
 

public class Main {
 
	
	public static int get(String a[],int index,int k,boolean visited[]) {
		
		if(index==a.length-1) {
			return 0;
		}
		if(index>=a.length || index<0 || visited[index]) {
			return Integer.MAX_VALUE/2;
		}
		
		visited[index] = true;
		int min = Integer.MAX_VALUE/2;
		for(int i=index+1;i<=index+k && i<a.length;i++) {
			if(a[index].charAt(i)=='1') {
				min = Math.min(min, get(a,i,k,visited)+1);
			}
		}
		for(int i=index-1;i>=index-k && i>=0;i--) {
			if(a[index].charAt(i)=='1') {
				min = Math.min(min, get(a,i,k,visited)+1);
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
			long h = s.nextLong();
			long ctr=1,sum=0;
			while(h>0) {
				sum+=ctr;
				ctr*=2;
				h=h/2;
			}
			System.out.println(sum);
		
	    
		
	}
}