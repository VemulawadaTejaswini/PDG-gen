import java.util.Scanner;

 class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int x,i=1;
		for(;;){
			x = sc.nextInt();
			if(x==0)break;
			System.out.println("Case "+i+": "+x);
			i++;
		}
	}
 }