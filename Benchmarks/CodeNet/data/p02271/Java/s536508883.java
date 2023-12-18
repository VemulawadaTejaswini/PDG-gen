import java.util.Scanner;



public class Main {
	static boolean brute(int[] A,int i,int x){
		if(x==0){
			return true;
		}
		if(i==A.length){
			return false;
		}
		if(brute(A,i+1,x)) return true;
		if(brute(A,i+1,x-A[i])) return true;
		return false;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n,q;
		n=scan.nextInt();
		int[] A=new int[n];
		for(int i=0;i<n;i++) A[i]=scan.nextInt();
		q=scan.nextInt();

		for(int i=0;i<q;i++){
			if(brute(A,0,scan.nextInt()) ) System.out.println("yes");
			else System.out.println("no");
		}
		
		
		
		scan.close();
	}
}