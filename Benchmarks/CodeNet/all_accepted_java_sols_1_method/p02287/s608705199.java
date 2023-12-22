import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n+1];
		int[] H = new int[n];
		for(int i=1; i<n+1; i++){
			A[i] = sc.nextInt();
		}
		
		for(int i=1; i<n+1; i++){
			System.out.print("node " + i + ": key = " + A[i] + ", ");
			if(i>1) System.out.print("parent key = " + A[i/2] + ", ");
			if(i<=n/2) System.out.print("left key = " + A[2*i] + ", ");
			if(i<=(n-1)/2) System.out.print("right key = " + A[2*i+1] + ", ");
			System.out.println();
		}
	}
}

