import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt(),k=cin.nextInt(),sum=0;
		for(int i=0;i<n;i++) sum+=Integer.parseInt(cin.next());
		double res=(double)sum/k;
		System.out.println((int)Math.ceil(res));
	}

}

