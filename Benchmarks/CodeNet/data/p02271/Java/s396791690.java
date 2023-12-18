import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
		 int[] A=new int[n];
		 for(int i=0; i<n; i++){
			 A[i]=sc.nextInt();
		 }
		 int q=sc.nextInt();
		 for(int i=0; i<q; i++){
			 int m=sc.nextInt();
			 if(check(m,A)){
				 System.out.println("yes");
			 }else{
				 System.out.println("no");
			 }

		 }
	}
	public static Boolean check(int m,int[] A){
		Boolean res=false;
		for(int j=0; j<A.length; j++){
			if(solve(j,m,A)){
				res=true;
				break;
			}
		}
		return res;
	}
	public static Boolean solve(int i,int m,int[] A){
		if(m==0){
			return true;
		}else if(i>=A.length){
			return false;
		}
		Boolean res=solve(i+1,m,A)||solve(i+1,m-A[i],A);
		return res;
	}



}
