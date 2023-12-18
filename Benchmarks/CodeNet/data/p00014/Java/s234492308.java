import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int d=sc.nextInt();
			int n=600/d;
			int total=0;
			for(int i=1; i<n; i++){
				total+=d*f(i*d);
			}
			System.out.println(total);

		}

		
	}

	public static double f(int x){//x???d,2d,3d...

		return x*x;
	}

}