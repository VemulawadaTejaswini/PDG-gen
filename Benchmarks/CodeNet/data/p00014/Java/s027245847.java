import java.util.Scanner;

class Main {
	public static void main(String[] args){
		output ();
	}
	
	private static void output(){
		int d;
		int e;
		int a = 0;
		int i = 0;
		Scanner cin = new Scanner(System.in);
		
		while (cin.hasNext()){
			d = cin.nextInt();
			for (e = 0; e <= 600 - d; e = d * i){
				a += e * e * d;
				i++;
			}
			System.out.println(a);
			a = 0;
			i = 0;
		}
	}
}