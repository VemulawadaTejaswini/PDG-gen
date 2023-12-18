import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n < 3 | n > 50000) break;
			int big = 2;
			int small = n + 1000;
			boolean isP = false;
			for(int i = 3; i <= n + 1000; i++){
				for(int j = 2; j < i; j++){
					if(i % j == 0){
						isP = false; break;
					}
					isP = true;
				}
				if(isP){
					if(i > big & i < n) big = i;
					else if(i < small & i > n) small = i;
				}
			}
			System.out.println(big + " " + small);
		}
	}
}