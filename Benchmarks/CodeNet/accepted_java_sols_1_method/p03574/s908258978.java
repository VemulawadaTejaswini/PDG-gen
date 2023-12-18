import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt(),w = scanner.nextInt();
		char[][] cstr = new char[h][w];
		for(int i=0;i<h;i++){
			String s = scanner.next();
			cstr[i] = s.toCharArray();
		}
		char[][] board = new char[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(cstr[i][j] == '#'){
					System.out.print("#");
					continue;
				}
				int count = 0;
				for(int k=-1;k<=1;k++){
					if(i+k < 0 || h - 1 < i+k){
						continue;
					}
					for(int l=-1;l<=1;l++){
						if(j+l < 0 || w - 1 < j+l){
							continue;
						}
						if(cstr[i+k][j+l] == '#'){
							count++;
						}
					}
				}
				System.out.print(count);
			}
			System.out.println();
		}
	}

}
