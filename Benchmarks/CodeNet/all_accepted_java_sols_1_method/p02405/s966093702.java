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
				if(i == 0 || i % 2 == 0){
					for(int j = 0; j < w; j++){
						if(j == 0 || j % 2 == 0){
							sb.append("#");
						}else{
							sb.append(".");
						}
					}
					sb.append("\n");
				}else{
					for(int j = 0; j < w; j++){
						if(j == 0 || j % 2 == 0){
							sb.append(".");
						}else{
							sb.append("#");
						}
					}
					sb.append("\n");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}