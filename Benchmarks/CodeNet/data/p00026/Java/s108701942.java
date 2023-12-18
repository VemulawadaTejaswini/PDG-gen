
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[][] square = new int[14][14];
		int[] func1_x = {1,0,-1,0};
		int[] func1_y = {0,1,0,-1};
		int[] func2_x = {1,1,0,-1,-1,-1,0,1};
		int[] func2_y = {0,1,1,1,0,-1,-1,-1};
		int[] func3_x = {2,0,-2,0};
		int[] func3_y = {0,2,0,-2};
		
		while(stdIn.hasNext()){
			String str = stdIn.nextLine();
			int x = (int)str.charAt(0)-(int)'0'+2;
			int y = (int)str.charAt(2)-(int)'0'+2;
			square[x][y]++;
			if((int)str.charAt(4)-(int)'0'==1){
				for(int i=0;i<4;i++){
					square[x+func1_x[i]][y+func1_y[i]]++;
				}
			}
			else if((int)str.charAt(4)-(int)'0'==2){
				for(int i=0;i<8;i++){
					square[x+func2_x[i]][y+func2_y[i]]++;
				}
			}
			else if((int)str.charAt(4)-(int)'0'==3){
				for(int i=0;i<8;i++){
					square[x+func2_x[i]][y+func2_y[i]]++;
				}
				for(int i=0;i<4;i++){
					square[x+func3_x[i]][y+func3_y[i]]++;
				}
			}
		}
		int count = 0;
		int depth = 0;
		for(int i=2;i<=11;i++){
			for(int j=2;j<=11;j++){
				if(square[i][j]==0){
					count++;
				}
				if(square[i][j]>depth){
					depth = square[i][j];
				}
			}
		}
		
		System.out.println(count);
		System.out.println(depth);
	}
}