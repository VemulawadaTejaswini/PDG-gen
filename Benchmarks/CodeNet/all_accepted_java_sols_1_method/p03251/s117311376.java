
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt(),X=sc.nextInt(),Y=sc.nextInt();
		int x[] = new int[N];
		int y[] = new int[M];
		for(int i=0;i<N;i++)x[i]=sc.nextInt();
		for(int i=0;i<M;i++)y[i]=sc.nextInt();
		sc.close();
		String ans = "No War";
		
		Arrays.sort(x);
		int Zmin = x[N-1]+1;
		
		Arrays.sort(y);
		int Zmax = y[0];
		
		if(X>=Zmax) ans = "War";
		if(Y<Zmin) ans = "War";
		if(Zmax<Zmin) ans = "War";
	
		System.out.println(ans);
 	}
}
