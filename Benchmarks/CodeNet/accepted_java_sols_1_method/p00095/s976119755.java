import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt(), y = sc.nextInt();
		
		for(int i = 0; i < n - 1; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(y < b){
				x = a;
				y = b;
			}
			if(y == b){
				if(x > a){
					x = a;
				}
			}
		}
		System.out.println(x + " " + y);
		
		sc.close();
	}
}