import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt(),y=in.nextInt();
		System.out.println(gcd(x,y));
	}
	
	static int gcd(int a,int b) {
		int v=a%b;
		if(v==0)return b;
		else return gcd(b,v);
	}

}

