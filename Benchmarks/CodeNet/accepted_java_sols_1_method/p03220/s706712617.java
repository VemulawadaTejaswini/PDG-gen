import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double f =9999;
		int g = 0;
		for(int i = 1; i <= a; i++){
			double d = sc.nextInt();
			double e = b-d*0.006;
			if(f>Math.abs(c-e)){
				f = Math.abs(c-e);
				g = i;
			}
		}
		System.out.println(g);
	}
}