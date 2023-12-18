
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int d=sc.nextInt();
	int count=0;
	for(int i=0;i<n;i++) {
		int x=Math.abs(sc.nextInt());
		int y=Math.abs(sc.nextInt());
		double ans2=Math.pow(x, 2)+Math.pow(y,2);
		
		double ans=Math.sqrt(ans2);
	if((double)d>=ans) {
		count++;
	}
	
		
	}
	System.out.println(count);
	}

}
