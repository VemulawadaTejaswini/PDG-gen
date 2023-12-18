import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = 0, y = 0;
		
		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(y < b){
				x = a;
				y = b;
			}
		}
		System.out.println(x + " " + y);
		
		sc.close();
	}
}