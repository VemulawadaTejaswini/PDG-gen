import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			int ans = 0;
			if(isInteger(Math.sqrt(i))){
				int round = (int) Math.sqrt(i);
				for( int x = 1; x <= i; x++){
					for(int y = 1; y <= i; y++){
						if(isInteger(round - x - y)&& round - x -y>0){
							ans++;
						}
					}
				}
			}
			System.out.println(ans);
		}
	}

	public static boolean isInteger(double number){
		return Math.ceil(number) == Math.floor(number);
	}

}