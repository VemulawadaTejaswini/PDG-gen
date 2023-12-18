import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if(!(x==0&&y==0)) {
			int judge = 0;
			for(int i=0;i<=x;i++) {
				if(4*i+2*(x-i)==y) {
					judge = 1;
					break;
				}
			}
			if(judge==1) {
				System.out.print("Yes");
			}else {
				System.out.print("No");
			}
			
		}
		else {
			System.out.print("Yes");
		}
		
	}

}