import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<Double> list = new ArrayList<Double>();
		double[][] ans = new double[1001][2];
		double[] angle = new double[1001];
		ans[0][0] = 1; ans[0][1] = 0;
		for(int i = 1; i < 1001; i++){
			angle[i] = angle[i-1] + Math.atan(1/Math.sqrt(i));
			ans[i][0] = Math.cos(angle[i])*Math.sqrt(i+1);
			ans[i][1] = Math.sin(angle[i])*Math.sqrt(i+1);
		}
		int n = stdIn.nextInt();
		while( n != -1 ){
			list.add(ans[n-1][0]);
			list.add(ans[n-1][1]);
			n = stdIn.nextInt();
		}
		for(Double p : list){
			System.out.printf("%.2f%n", p);
		}
	}
}