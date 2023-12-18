import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int A = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		System.out.print("#");
		for(int j=0;j<W;j++){
			System.out.print("#");
		}
		System.out.println("#");
		
		
		for(int i=0;i<H;i++){
			System.out.print("#");
			System.out.print(sc.next());
			System.out.println("#");
		}
		
		
		System.out.print("#");
		for(int j=0;j<W;j++){
			System.out.print("#");
		}
		System.out.println("#");
		
	}

}
