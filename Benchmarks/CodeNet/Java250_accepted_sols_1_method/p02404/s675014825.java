import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder();

		while (true) {
			int h = scan.nextInt();
			int w = scan.nextInt();

			if (h == 0 && w == 0)
				break;
			
			//上の部分
			for (int i = 0; i < w; i++)
				str.append("#");        
			str.append("\n");           
			
			//中の部分
			for (int i = 0; i < h - 2; i++) {
				str.append("#");
				for (int j = 0; j < w - 2; j++) {
					str.append(".");
				}
				str.append("#\n");
			}
			
			//下の部分
			for (int i = 0; i < w; i++)
				str.append("#");
			str.append("\n");
			
			//1行あける
			str.append("\n");  
		}
		System.out.print(str);
	}
}