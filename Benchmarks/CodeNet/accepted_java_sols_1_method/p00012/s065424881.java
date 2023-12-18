import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		double x[]=new double[5];
		double y[]=new double[5];
		while(in.hasNext()){
			for(int i=0;i<4;i++){
				x[i]=in.nextDouble();
				y[i]=in.nextDouble();
			}
			boolean ans[]=new boolean[5];
			for(int i=0;i<3;i++)ans[i]=(y[i]-y[(i+1)%3])*(x[i]-x[3])<(y[i]-y[3])*(x[i]-x[(i+1)%3]);
			if(ans[0]==ans[1]&&ans[1]==ans[2]) System.out.println("YES");
			else System.out.println("NO");
		}
		in.close();
	}
}