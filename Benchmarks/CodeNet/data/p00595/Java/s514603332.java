import java.util.Scanner;


public class Main {
	
	public static int gcd(int a, int b){
		int r;
		if(b > a){
			int t = a;
			a = b;
			b = t;
		}
		
		while((r = a % b) != 0){
			a = b;
			b = r;
		}
		
		return b;
	}
	
	public static void main(String[] args) {a
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			System.out.println(gcd(sc.nextInt(), sc.nextInt()));
		}

	}

}