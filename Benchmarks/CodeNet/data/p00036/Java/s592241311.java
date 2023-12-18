import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] tmp = new String[8];
			int[][] map = new int[8][8];
			for(int i = 0; i < 8; i++){
				tmp[i] = sc.next();
				char[] c = tmp[i].toCharArray();
				for(int j = 0; j < 8; j++){
					map[i][j] = c[j] - '0';
					if(c[j] == '1') map[i][j] = 1;
				}
			}
			for(int i = 0; i < 8; i++){
				for(int j = 0; j < 8; j++){
					if(map[i][j] == 1){
						if(map[i+1][j] == 1 && map[i][j+1] == 1 && map[i+1][j+1] == 1){
							System.out.println("A");
						}else if(map[i+1][j] == 1 && map[i+2][j] == 1 && map[i+3][j] == 1){
							System.out.println("B");
						}else if(map[i][j+1] == 1 && map[i][j+2] == 1 && map[i][j+3] == 1){
							System.out.println("C");
						}else if(map[i+1][j-1] == 1 && map[i][j+1] == 1 && map[i+2][j-1] == 1){
							System.out.println("D");
						}else if(map[i][j+1] == 1 && map[i+1][j+1] == 1 && map[i+1][j+2] == 1){
							System.out.println("E");
						}else if(map[i+1][j] == 1 && map[i+1][j+1] == 1 && map[i+2][j+1] == 1){
							System.out.println("F");
						}else if(map[i][j+1] == 1 && map[i+1][j-1] == 1 && map[i+1][j] == 1){
							System.out.println("G");
						}
					}
				}
			}
		}
	}
}