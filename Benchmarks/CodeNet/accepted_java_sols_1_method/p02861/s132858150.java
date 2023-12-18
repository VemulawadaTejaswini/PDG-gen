import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N=sc.nextInt(),x[]=new int[N],y[]=new int[N];
		double dis=0;
		for(int i=0;i<N;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				int dx = (int) Math.pow(x[i]-x[j],2);
				int dy = (int) Math.pow(y[i]-y[j],2);
				dis += Math.pow(dx+dy,0.5);
			}
		}
		System.out.println(dis/N);
	}
}