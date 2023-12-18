import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				for(int k = 1; k <= n; k++){
					if(i == j || j == k){
						continue;
					}else if(i < j && j < k){
						int s = i + j + k;
						if(s == x){
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}

}