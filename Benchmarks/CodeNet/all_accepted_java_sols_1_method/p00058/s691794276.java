import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<String> ans = new ArrayDeque<String>();

		while(sc.hasNext()){
			double[] x = new double[4];
			double[] y = new double[4];
			for(int i=0;i<4;i++){			
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			double a = (y[0]-y[1]);
			double b = (x[0]-x[1]);
			double c = (y[2]-y[3]);
			double d = (x[2]-x[3]);
			if((a*c)/(b*d)==-1 || (a==0 && d==0) || (b==0 && c==0)){
				ans.push("YES");
			}else{
				ans.push("NO");
			}
			
		}
		int num = ans.size();
		for(int i=0;i<num;i++){
			System.out.println(ans.pollLast());
		}
	}
}