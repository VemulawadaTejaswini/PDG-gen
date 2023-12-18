import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());

			if(n == 0){
				break;
			}

			int[][] area = new int[21][21];

			for(int i = 0; i < n; i++){
				String[] tmpArray = br.readLine().split(" ");
				int x = Integer.parseInt(tmpArray[0]);
				int y = Integer.parseInt(tmpArray[1]);

				area[y][x] = 1;
			}

			int m = Integer.parseInt(br.readLine());

			int currentX = 10;
			int currentY = 10;
			int caught = 0;

			for(int i = 0; i < m; i++){
//				System.out.println("x = "+currentX +" y = "+currentY);
				String[] tmpArray = br.readLine().split(" ");

				String op = tmpArray[0];
				int d = Integer.parseInt(tmpArray[1]);

				if(op.equals("N")){
					for(int j = 1; j <= d ;j++ ){
//						System.out.println("North j = "+j+" gem "+area[currentY + d][currentX] );
						if(area[currentY + j][currentX] > 0){
//							System.out.println("N GET!!");
							caught++;
							area[currentY + j][currentX]--;
						}
					}
					currentY += d;
				}
				if(op.equals("S")){
					for(int j = 1; j <= d ;j++ ){
						if(area[currentY - j][currentX] > 0){
//							System.out.println("S GET!!");
							caught++;
							area[currentY - j][currentX]--;
						}
					}
					currentY -= d;
				}
				if(op.equals("W")){
					for(int j = 1; j <= d ;j++ ){
						if(area[currentY][currentX - j] > 0){
//							System.out.println("W GET!!");
							caught++;
							area[currentY][currentX - j]--;
						}
					}
					
					currentX -= d;
				}
				if(op.equals("E")){
					for(int j = 1; j <= d ;j++ ){
						if(area[currentY][currentX + j] > 0){
//							System.out.println("E GET!!");
							caught++;
							area[currentY][currentX + j]--;
						}
					}
					
					currentX += d;
				}
				
				
			}
			
			if(caught == n){
				System.out.println("Yes");
			}
			
			else {
				System.out.println("No");
			}

		}
	}

}