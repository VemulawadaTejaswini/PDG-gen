import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int h = x.nextInt();
		int w = x.nextInt();
		StringBuilder sb1 = new StringBuilder();
		while (h != 0 || w != 0){
			for (int i = 0 ; i < w ; i++ ){
				sb1.append("#");
			}
			int k = 0;
			sb1.append("\n");
			while (k < h-2){
			k++;
			sb1.append("#");
				for (int n = 0 ; n < w-2 ; n++){
				sb1.append(".");
				}
			sb1.append("#");
			sb1.append("\n");
			}

			for (int r = 0 ; r < w ; r++ ){
				sb1.append("#");
			}
			sb1.append("\n");
			sb1.append("\n");
			h = x.nextInt();
			w = x.nextInt();
		}
		System.out.print(sb1);
	}

}