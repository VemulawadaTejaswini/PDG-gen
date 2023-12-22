import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.println(koya(Math.max(x, y),Math.min(x, y)));
	}
	
	public static int koya(int a,int b){
		
		if(b == 0){
			return a;
		}else{
			return koya(b,a%b);
		}
	}
}
