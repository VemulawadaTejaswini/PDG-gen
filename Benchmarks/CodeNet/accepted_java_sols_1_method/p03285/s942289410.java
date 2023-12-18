import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		boolean flag = false;
		for(int i = 0; i <= 100/4; i ++){
			for(int j = 0; j <= 100/7; j++){
				if(4 * i + 7 * j == n){
					flag = true;
					break;
				}
			}
			if(flag == true) break;
		}
		
		if(flag == true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}

}
