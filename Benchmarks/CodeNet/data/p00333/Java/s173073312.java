import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int W=in.nextInt(),H=in.nextInt(), C=in.nextInt();
		
		int n=gcd(W,H);
		System.out.println((W/n)*(H/n)*C);
	}
	
	static int gcd(int x,int y){
		int r=x;
		if(y!=0) r=gcd(y,x%y);
		return r;
	}

}

