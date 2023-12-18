import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] science = new int[4];
		int minsc = 100;
		int sumsc = 0;
		for(int i = 0; i < 4; i++) {
			science[i] = sc.nextInt();
			minsc = Math.min(minsc, science[i]);
			sumsc += science[i];
		}
		sumsc -= minsc;
		
		int sumso = sc.nextInt();
		int x = sc.nextInt();
		if(sumso < x) {
			sumso = x;
		}
		
		System.out.println(sumsc + sumso);
	}
}
