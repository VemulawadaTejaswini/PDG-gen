import java.util.*;

class Main {
	public static void main (String [] args){
		ansPrint();	
	}

	static int digits(int n){
		return Integer.toString(n).length();
	}

	static void ansPrint(){
		Scanner sc = new Scanner(System.in);
		int a, b, sum;
		while(sc.hasNextInt()){
			a = sc.nextInt();
			b = sc.nextInt();
			sum = a + b;
			System.out.println(digits(sum));
		}
	}
}	