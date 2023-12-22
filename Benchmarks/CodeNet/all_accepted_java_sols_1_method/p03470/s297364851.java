import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=Integer.parseInt(sc.nextLine());
		int d[]=new int[N];
		for(int i=0;i<N;i++){
			d[i]=Integer.parseInt(sc.nextLine());
		}
		int X=N;
		int buf;
		for(int i=0;i<N;i++){
			buf=d[i];
			for(int j=0;j<i;j++){
				if(buf==d[j]&&d[j]!=0){
					X-=1;
					d[j]=0;
				}
			}
		}
		System.out.println(X);
	}
}
