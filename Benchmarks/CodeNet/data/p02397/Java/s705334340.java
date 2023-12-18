import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(int i =0;i<3000;i++) {
			int x = s.nextInt();
			int y= s.nextInt();
			if(x>=0 && y>=0 && x<=10000 && y<=10000) {
			if(x>y) {
				System.out.print(y+" ");
				System.out.println(x);
			}else {
				System.out.print(x+" ");
				System.out.println(y);
			}
			if(x==0 && y==0) {
				break;
			}
			}
		}
	}

}