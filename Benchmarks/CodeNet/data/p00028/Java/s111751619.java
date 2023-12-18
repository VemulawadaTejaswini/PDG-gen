import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		int [] x = new int[100];
		int i = 0;
		int a = 0;
		
		while (cin.hasNext()){
			i = cin.nextInt();
			x[i]++;
		}
		
		for (i = 0; i < 100; i++){
			if (a < x[i]){
				a = x[i];
			}
		}
		for (i = 0; i < 100; i++){
			if (a == x[i]){
				System.out.println(i);
			}
		}
	}
}