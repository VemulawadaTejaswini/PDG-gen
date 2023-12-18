import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){

		while(scan.hasNext()){
			int[][] mas = new int[8][8];
			for(int i = 0; i < 8; i++){
				for(int j = 0; j < 8; j++){
					mas[i][j] = scan.nextInt();
				}
			}
			String type = "";
			for(int i = 0; i < 8; i++){
				for(int j = 0; j < 8; j++){
					if(mas[i][j] == 1){
						if(i+1 < 8 && j+1 < 8){
							if(mas[i][j+1] == 1 && mas[i+1][j] == 1	&& mas[i+1][j+1] == 1){
								type = "A";
								break;
							}
						}
						if(i+1 < 8 && i+2 < 8 && i+3 < 8){
							if(mas[i+1][j] == 1 && mas[i+2][j] == 1	&& mas[i+3][j] == 1){
								type = "B";
								break;
							}
						}
						if(j+1 < 8 && j+2 < 8 && j+3 < 8){
							if(mas[i][j+1] == 1 && mas[i][j+2] == 1	&& mas[i][j+3] == 1){
								type = "C";
								break;
							}
						}
						if(i+1 < 8 && j-1 >= 0 && i+2 < 8){
							if(mas[i+1][j-1] == 1 && mas[i+1][j] == 1 && mas[i+2][j-1] == 1){
								type = "D";
								break;
							}
						}
						if(j+1 < 8 && i+1 < 8 && j+2 < 8){
							if(mas[i][j+1] == 1 && mas[i+1][j+1] == 1 && mas[i+1][j+2] == 1){
								type = "E";
								break;
							}
						}
						if(i+1 < 8 && j+1 < 8 && i+2 < 8){
							if(mas[i+1][j] == 1 && mas[i+1][j+1] == 1 && mas[i+2][j+1] == 1){
								type = "F";
								break;
							}
						}
						if(j+1 < 8 && j-1 >= 0){
							if(mas[i][j+1] == 1 && mas[i+1][j-1] == 1 && mas[i+1][j] == 1){
								type = "G";
								break;
							}
						}
					}
				}
			}
			System.out.printf("%s\n", type);
		}
	}
}