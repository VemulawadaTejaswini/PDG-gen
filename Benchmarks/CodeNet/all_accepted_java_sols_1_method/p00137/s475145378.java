import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			int num = sc.nextInt();
			
			System.out.println("Case " + (i+1) + ":");
			for(int j = 0; j < 10; j++){
				int new_num = ((num * num) / 100) % 10000;
				System.out.println(new_num);
				num = new_num;
			}
		}
	}
	
}