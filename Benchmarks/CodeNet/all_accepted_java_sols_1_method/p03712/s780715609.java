import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		char a[][]=new char[h][w];
		for(int i=0;i<h;i++) {
			String s = scan.next();
			a[i]=s.toCharArray();
		}
		scan.close();

		for(int i=-1;i<=h;i++) {
			for(int j=-1;j<=w;j++) {
				if(0<=i && i<h && 0<=j&&j<w){
					System.out.print(a[i][j]);
				}else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}
