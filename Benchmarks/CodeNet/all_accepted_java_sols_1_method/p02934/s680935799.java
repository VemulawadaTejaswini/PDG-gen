import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		double bunsi=1;
		for(int i=0;i<n;i++){
			bunsi*=a[i];
		}
		double bunbo=0;
		for(int i=0;i<n;i++){
			bunbo+=bunsi/a[i];
		}
		System.out.println(bunsi/bunbo);
	}
	
}