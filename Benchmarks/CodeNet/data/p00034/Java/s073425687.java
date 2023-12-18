import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int[] x = new int[12];
			for(int i = 0; i < 12; i++)
				 x[i] = sc.nextInt();

			int a = x[10];
			int b = x[11];
			for(int i = 1; i < 10; i++)
				x[i] += x[i-1];

			for(int i = 0; i < 10; i++){
				if(x[9] * a <= x[i] * (a+b)){
					System.out.println(i+1);
					break;
				}
			}
		}
		sc.close();
	}
}