import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextDouble()){
			double x = sc.nextDouble();
			double t = x / 9.8;
			double y = 4.9 * Math.pow(t, 2);
			int N = 0;
			while(5 * N -5 < y){
				N++;
			}
			System.out.println(N);
		}
	}
}