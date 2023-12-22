import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true){
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			
			if(h == 0 && w == 0){
				break;
			}

			for(int i = 0; i < h; i++){
				if(i == 0 || i == h-1){
					for(int j = 0; j < w; j++){
					sb.append("#");
					}
					sb.append("\n");
				}else{
					sb.append("#");
					for(int j = 0; j < w-2; j++){
					sb.append(".");
					}
					sb.append("#");
					sb.append("\n");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}