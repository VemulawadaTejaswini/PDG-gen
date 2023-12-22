import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] t= new int[N+10];
		int[] x= new int[N+10];
		int[] y= new int[N+10];
		for (int i=0;i<N;i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		int X=0;
		int Y=0;
		int T=0;
		int flag=0;

		for (int i=0;i<N;i++) {
			if (((Math.abs(x[i]-X)+Math.abs(y[i]-Y))<=(t[i]-T))&&(((t[i]-T)-(Math.abs(x[i]-X)+Math.abs(y[i]-Y)))%2==0)) {
				X=x[i];
				Y=y[i];
				T=t[i];
			}else {
				flag=1;
				break;
			}
		}

		if (flag==0) {
			System.out.println("Yes");
		}else if (flag==1) {
			System.out.println("No");
		}
	}
}