import java.util.Scanner;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i = 0; i < N; i++){
			double x1 = scan.nextDouble();
			double y1 = scan.nextDouble();
			double x2 = scan.nextDouble();
			double y2 = scan.nextDouble();
			double x3 = scan.nextDouble();
			double y3 = scan.nextDouble();
			double x4 = scan.nextDouble();
			double y4 = scan.nextDouble();
			if((x2-x1) * (y4-y3) == (x4-x3) * (y2-y1)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}