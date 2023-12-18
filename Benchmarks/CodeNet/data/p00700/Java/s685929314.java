import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int i = 0;
		while(i < n){
			
			int currentX = 0;
			int currentY = 0;
			
			int furtherX = 0;
			int furtherY = 0;
			while(true){
				String[] tmp = br.readLine().split(" ");
				int dx = Integer.parseInt(tmp[0]);
				int dy = Integer.parseInt(tmp[1]);
				
				if(dx == 0 && dy == 0){
					break;
				}
				currentX += dx;
				currentY += dy;
				
				int curDist = currentX*currentX + currentY*currentY;
				int furDist = furtherX*furtherX + furtherY*furtherY;
				
				if(curDist > furDist || (curDist == furDist && currentX > furtherX)){
					furtherX = currentX;
					furtherY = currentY;
				}
				/*
				if(currentX == 0 && currentY == 0){
					break;
				}*/
			}
			System.out.println(furtherX + " " + furtherY);
			
			i++;
		}
	}
}