import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, x;
		int count;
		while(true){
			n = sc.nextInt();
			x = sc.nextInt();
			count = 0;
			if(n == 0 && x == 0)
				break;
			else if(n < 3 || n > 100){
				System.out.println("Error");
				continue;
			}
			else{
				for(int i = 1; i <= n; i++){
					for(int j = i+1; j <= n; j++){
						for(int k = j+1; k <= n; k++){
							if(x == i + j + k)
								count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}