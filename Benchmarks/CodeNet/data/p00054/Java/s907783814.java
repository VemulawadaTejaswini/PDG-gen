import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			double a = cin.nextDouble();
			double b = cin.nextDouble();
			int n = cin.nextInt();
			a = a/b;
			int sum=0;
			//System.out.println(a);
			for(int i = 0; i < n;i++){
				a *= 10.0;
				int c = (int)a;
				//System.out.println(c);
				sum = sum+c%10;
				if(a >= 1000){
					a = a-(int)a;
				}
			}
			System.out.println(sum);
		}
	}

}