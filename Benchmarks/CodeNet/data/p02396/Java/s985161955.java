import java.util.Scanner;

class Main{
	Scanner scanner = new Scanner();
	public static void main(String[] args){
		for(int i = 1; i <= 10000; i ++){
			int num = scanner.nextInt();
			if(num == 0){
				break;
			}else{
				System.out.println("Case " + i + ": " + num);
			}
		}
		
	}
}