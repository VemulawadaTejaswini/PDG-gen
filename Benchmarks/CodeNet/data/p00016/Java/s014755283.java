import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int exit=0;
		double x=0;
		double y=0;
		int sum=0;
		while(exit==0){
			String s = sc.next();
			int j=0;
			while(s.substring(j, j+1).compareTo(",")!=0){
				j++;
			}
			int n = Integer.valueOf(s.substring(0, j));
			int m = Integer.valueOf(s.substring(j+1, s.length()));
			if(n==0 && m==0)exit=1;
			if(exit==0){
				x += n*Math.sin(sum*Math.PI/180);
				y += n*Math.cos(sum*Math.PI/180);
				sum += m;
			}
		}
		System.out.println((int)x);
		System.out.println((int)y);
	}
}