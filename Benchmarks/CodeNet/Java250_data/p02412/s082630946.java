import java.util.Scanner;
class Main{
	public static void main(String[]agrs){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int x = sc.nextInt();
			if(n == 0 && x == 0) break;
			int count = 0;
			for(int i = 1; i <= n; i++){
				for(int j = 1; j <= n; j++){
					for(int k = 1; k <= n; k++){
						if(i + j + k == x && i != j
								&& j != k && i != k){
							count++;
						}
					}
				}
			}
			System.out.println(count/6);
		}
	}
}