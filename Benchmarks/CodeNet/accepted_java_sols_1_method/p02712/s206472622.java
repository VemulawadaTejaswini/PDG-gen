import java.util.Scanner;

class Main {
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long somma = 0;
		for(int i=1; i<=N; ++i){
			if(i%3!=0 && i%5!=0) somma+=i;
		}
		System.out.print(somma);
	}
}
