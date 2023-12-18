import java.util.Scanner;
public class Main {
	static String[] c = {"#", "."};
	
	static void print(int r) {
		//DEBUG System.out.print("数字：" + r);
		switch(r % 2) {
			case 0: System.out.print(c[0]); break;
			case 1: System.out.print(c[1]); break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			int height = stdIn.nextInt();
			int width = stdIn.nextInt();
			if(height == 0 && width == 0) break;
			for(int r = 0; r < height; r++) { 
				for(int c = (r % 2 == 0) ? 0 : 1; c < ((r % 2 == 0) ? width : width + 1); c++) {
					print(c);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}