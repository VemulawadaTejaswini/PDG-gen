import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			System.out.println(gcd(in.nextInt(), in.nextInt()));
		}
	}

	static int gcd(int x, int y){
		return (x==0)?y:gcd(y%x,x);
	}
}