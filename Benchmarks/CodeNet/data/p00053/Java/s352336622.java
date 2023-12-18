import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			boolean isP = true;
			if(n == 0 || n > 10000) break;
			int sum = 2;
			int count = 0;
			n -= 1;

			for(int i = 3; i < 10000; i+=2){
				if(count == n) break;
				isP = true;
				if(i >= 7){
					if(i % 3 == 0 || i % 5 == 0) {
						continue;
					}
				}
				for(int j = 2; j < i; j++){
					if( i % j == 0) {
						break;
					}
				}
				if(isP) {
					sum += i;
					count++;
				}

			}
			System.out.println(sum);
		}
	}
}