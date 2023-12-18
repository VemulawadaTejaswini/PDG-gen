import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			StringBuilder sb = new StringBuilder();

			if(h == 0 && w == 0){
				break;
			}

			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					sb.append("#");
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
	}
}