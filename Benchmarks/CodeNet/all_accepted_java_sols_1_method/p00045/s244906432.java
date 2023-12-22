import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;
		int avg = 0;
		int sum = 0;
		while(sc.hasNext()){
			String s = sc.next();
			int i=0;
			while(s.substring(i,i+1).compareTo(",")!=0)i++;		
			int a = Integer.valueOf(s.substring(0,i));
			int b = Integer.valueOf(s.substring(i+1,s.length()));
			sum += a*b;
			avg += b;
			n++;
		}
		double m = (double)avg/n;
		avg = (int)(m+0.5);
		System.out.println(sum);
		System.out.println(avg);
	}
}