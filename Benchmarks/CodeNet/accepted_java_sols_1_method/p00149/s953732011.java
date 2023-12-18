import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int siryoku[][] = new int [4][2];
 		while(true){
			try{
				double left = in.nextDouble();
				double right = in.nextDouble();
				if(left >= 1.1){
					siryoku[0][0]++;
				}else if(left >= 0.6 && left < 1.1){
					siryoku[1][0]++;
				}else if(left >= 0.2 && left < 0.6){
					siryoku[2][0]++;
				}else if(left < 0.2){
					siryoku[3][0]++;
				}
				if(right >= 1.1){
					siryoku[0][1]++;
				}else if(right >= 0.6 && right < 1.1){
					siryoku[1][1]++;
				}else if(right >= 0.2 && right < 0.6){
					siryoku[2][1]++;
				}else if(right < 0.2){
					siryoku[3][1]++;
				}
			}catch(Exception e){
				for(int i = 0;i < 4;i++){
					System.out.println(siryoku[i][0] + " " + siryoku[i][1]);
				}
				System.exit(0);
			}
		}
	}
}