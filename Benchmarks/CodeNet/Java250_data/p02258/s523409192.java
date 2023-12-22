import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int R0=sc.nextInt();
		int M=R0;
		int m=R0;
		int M2=R0;
		int Mn=0;
		int mn=0;
		int M2n=0;
		int R=sc.nextInt();
		if(m>R){
			m=R;
			mn=1;
		}
		if(M<=R){
			M=R;
			Mn=1;
		}
		int d=R-R0;
		for(int i=2;i<n;i++){
			R=sc.nextInt();
			if(mn<=Mn){
				if(m>R){
					m=R;
					mn=i;
				}
				if(M<=R){
					M=R;
					Mn=i;
					d=M-m;
				}
			}else{
				if(m>R){
					m=R;
					mn=i;
				}else if(M<=R){
					M=R;
					Mn=i;
					d=M-m;
				}else if(M2<R||M2n<mn){
					M2=R;
					M2n=i;
					if(d<R-m){
						d=R-m;
					}
				}
			}
		}
		System.out.println(d);
	}
}