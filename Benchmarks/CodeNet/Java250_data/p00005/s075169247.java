import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int input1 = sc.nextInt();
			int input2 = sc.nextInt();
			//gcd
			int gcd = gcd(input1, input2);
			//lcm
			int lcm = input1 / gcd * input2;
			System.out.println(gcd + " " + lcm);
		}
	}

	private int gcd(int a, int b){
		if(b == 0) return a;
		else return gcd(b, a % b);
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}

}