import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		for(int i = 1; i <= 3000; i ++){
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			if(x == 0 && y == 0){
				break;
			}else if(x > y){
				System.out.println(y + " " + x);
			}else if(x < y){
				System.out.println(x + " " + y);
			}
		}
		
	}
}