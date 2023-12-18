import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){

		while(scan.hasNext()){
			int[][] mas = new int[8][8];
			for(int i = 0; i < 8; i++){
				String in = scan.nextLine();
				for(int j = 0; j < 8; j++){
					char c = in.charAt(j);
					String s = String.valueOf(c);
					int n = Integer.parseInt(s);
					mas[i][j] = n;
				}
			}
			boolean flag = false;
			String type = "";
			Loop:for(int i = 0; i < 8; i++){
				for(int j = 0; j < 8; j++){
					if(mas[i][j] == 1){
						if(j+1 < 8 && i+1 < 8){
							if(mas[i][j+1] == 1 && mas[i+1][j] == 1 && mas[i+1][j+1] == 1){
								flag = true;
								type = "A";
								break Loop;
							}
						}
						if(i+1 < 8 && i+2 < 8 && i+3 < 8){
							if(mas[i+1][j] == 1 && mas[i+2][j] == 1 && mas[i+3][j] == 1){
								flag = true;
								type = "B";
								break Loop;
							}
						}
						if(j+1 < 8 && j+2 < 8 && j+3 < 8){
							if(mas[i][j+1] == 1 && mas[i][j+2] == 1 && mas[i][j+3] == 1){
								flag = true;
								type = "C";
								break Loop;
							}
						}
						if(j+1 < 8 && i+1 < 8 && j+2 < 8){
							if(mas[i][j+1] == 1 && mas[i+1][j+1] == 1 && mas[i+1][j+2] == 1){
								flag = true;
								type = "E";
								break Loop;
							}
						}
						if(i+1 < 8 && j+1 < 8 && i+2 < 8){
							if(mas[i+1][j] == 1 && mas[i+1][j+1] == 1 && mas[i+2][j+1] == 1){
								flag = true;
								type = "F";
								break Loop;
							}
						}
					} else if(mas[i][j] == 0){
						if(j+1 < 8 && i+1 < 8 && i+2 < 8){
							if(mas[i][j+1] == 1 && mas[i+1][j] == 1 && mas[i+1][j+1] == 1 && mas[i+2][j] == 1){
								flag = true;
								type = "D";
								break Loop;
							}
						}
						if(j+1 < 8 && j+2 < 8 && i+1 < 8){
							if(mas[i][j+1] == 1 && mas[i][j+2] == 1 && mas[i+1][j] == 1 && mas[i+1][j+1] == 1){
								flag = true;
								type = "G";
								break Loop;
							}
						}
					}
				}
			}
			System.out.printf("%s\n", type);
		}
	}
}