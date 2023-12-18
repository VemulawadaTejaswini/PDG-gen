import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		int i,j,k,t,min,minv,maxv,l;
		Scanner sc=new Scanner(System.in);
		t=Integer.parseInt(sc.next());
		int n[]=new int[t+1];
		for(i=0;i<t;i++){
			n[i]=Integer.parseInt(sc.next());
		}
		
		minv=n[0];
		maxv=n[1]-n[0];
		for(i=1;i<t;i++){
			maxv=Math.max(maxv, n[i]-minv);
			minv=Math.min(minv, n[i]);
		}
		System.out.println(maxv);
	}
}