import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] heap=new int[n+1];
	for(int i=1;i<=n;i++) heap[i]=sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		System.out.print("node "+i+": key = "+heap[i]+",");
		if(parent(i)>=1) System.out.print(" parent key = " +heap[parent(i)]+",");
		if(left(i)<=n) System.out.print(" left key = "+heap[left(i)]+",");
		if(right(i)<=n) System.out.print(" right key = "+ heap[right(i)]+",");
		System.out.println("");
	}
	
	}
	
	private static int parent(int x){
		return x/2;
	}
	
	private static int left(int x){
		return 2*x;
	}
	
	private static int right(int x){
		return 2*x+1;
	}
	
}