import java.util.Scanner;

 class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		
		while(true){
			x = scan.nextInt();
			y = scan.nextInt();
			if(x == 0 && y == 0)break;
			if(x > y){
				System.out.println(y + " " + x);
			}
			else if(x < y){
				System.out.println(x + " " + y);
			}
			if(x == y ){
				System.out.println(x + " " + y);
			}
		}
	}	
}