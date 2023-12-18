import java.util.Scanner;

class Main {
	public static void main(String[] args){
		input();
	}
	
	private static void input (){
		int d;
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			d = cin.nextInt();
			output(calculation(d));
		}
	}
	
	private static int calculation (int d){
		int e;
		int a = 0;
		int i = 0;
		
		for (e = 0; e <= 600 - d; e = d * i){
			a += e * e * d;
			i++;
		}
		return (a);
	}
	
	private static void output(int a){
		System.out.println(a);
	}
}