
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x == 0 && y == 0){
				break;
			}
			int [][] dp = new int[y+2][x+2];
			int [][] data = new int[y+2][x+2];
			for(int i=1; i< y+1; i++){
				for(int j=1; j < x + 1; j++){
					data[i][j] = sc.nextInt();
				}
			}
			//set a first value
			for(int i=1; i < x+1; i++){
				dp[1][i] = 1;
			}

			//calc a dp
			for(int i=1; i <= y-1; i++){
				for(int j=1; j <= x; j++){
					int posSta = data[i][j];
					if(posSta == 1){
						continue;
					}
					else if(posSta == 2){
						dp[i+2][j] += dp[i][j];
					}
					else{
						//left buttom
						if(data[i+1][j-1] != 2){
							dp[i+1][j-1] += dp[i][j];
						}
						//buttom
						dp[i+1][j] += dp[i][j];

						//right buttom
						if(data[i+1][j+1] != 2){
							dp[i+1][j+1] += dp[i][j];
						}
					}
				}
			}

			//print
			int sum = 0;
			for(int i=y; i <= y + 1; i++){
				for(int j=1; j <= x; j++){
					if(data[i][j] == 1)
						continue;
					sum += dp[i][j];
				}
			}
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}