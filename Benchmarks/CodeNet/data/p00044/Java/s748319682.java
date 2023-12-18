import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
			int n = sc.nextInt();
			int big = 0;
			int small = n + 100;
			boolean isP = false;
			for(int i = 5; i <= n + 100; i += 2){
				for(int j = 2; j < i; j++){
					if(i % j == 0){
						isP = false;
						break;
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