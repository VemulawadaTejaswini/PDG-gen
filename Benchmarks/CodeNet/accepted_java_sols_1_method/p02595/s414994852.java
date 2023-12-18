import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(), D=s.nextInt(), c=0;
		for(int i=0;i<N;i++) {
			long X=s.nextInt(), Y=s.nextInt();
			if(D>=Math.sqrt(X*X+Y*Y))c++;
		}
		System.out.println(c);
	}
}
