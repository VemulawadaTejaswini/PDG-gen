import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		while(sc.hasNext()){
			a = sc.nextDouble();
			double sum = a;
			for(int i = 1; i <= 10; i++){
				if(i % 2 == 0) sum += (i-1)*2;
				else sum += (i-1)/3;
			}
			System.out.println(sum);
		}
	}
}