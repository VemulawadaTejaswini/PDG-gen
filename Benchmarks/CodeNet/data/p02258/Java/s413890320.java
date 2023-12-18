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
		for(i=1;i<t-1;i++){
			if(maxv>n[i]-minv){
				maxv=maxv;
			}
			else{
				maxv=n[i]-minv;
			}
			if(minv<n[i]){
				minv=minv;
			}
			else{
				minv=n[i];
			}
		}
		System.out.println(maxv);
	}
}