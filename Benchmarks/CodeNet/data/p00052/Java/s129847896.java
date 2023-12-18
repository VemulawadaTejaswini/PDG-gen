import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int count = 0;
			long temp = 1;
			for(int i = n; i > 0; i--){
				temp *= i;
				if(temp > 1000000000) temp %= 1000000000;
				if(temp % 10 == 0){
					count++;
					temp /= 10;
				}
			}
			System.out.println(count);
		}
	}
}