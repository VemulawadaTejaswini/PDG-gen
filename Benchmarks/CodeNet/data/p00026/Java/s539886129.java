import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int yx[][] = new int [10][10];
		while(true){
			try{
				String str[] = sc.nextLine().split(",");
				int x = Integer.parseInt(str[0]);
				int y = Integer.parseInt(str[1]);
				int ink = Integer.parseInt(str[2]);
				if(ink >= 1){
					if(y > 0){
						yx[y-1][x]++;
					}if(y < 9){
						yx[y+1][x]++;
					}if(x > 0){
						yx[y][x-1]++;
					}if(x < 9){
						yx[y][x+1]++;
					}if(ink >= 2){
						if(y > 0 && x > 0){
							yx[y-1][x-1]++;
						}if(y < 9 && x > 0){
							yx[y+1][x-1]++;
						}if(y > 0 && x < 9){
							yx[y-1][x+1]++;
						}if(y < 9 && x < 9){
							yx[y+1][x+1]++;
						}if(ink == 3){
							if(y > 1){
								yx[y-2][x]++;
							}if(y < 8){
								yx[y+2][x]++;
							}if(x > 1){
								yx[y][x-2]++;
							}if(x < 8){
								yx[y][x+2]++;
							}
						}
					}
				}
			}catch(Exception g){
				int max = 0;
				int zero = 0;
				for(int i = 0;i < 10;i++){
					for(int j = 0;j < 10;j++){
						if(yx[i][j] > max){
							max = yx[i][j];
						}if(yx[i][j] == 0){
							zero++;
						}
					}
				}
				System.out.println(max);
				System.out.println(zero);
				System.exit(0);
			}
		}
	}
    public static void main(String[] args) {
    	new Main().doIt();
    }
}