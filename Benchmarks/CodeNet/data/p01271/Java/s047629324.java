import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0)break;
			else calc(w, h);
			
		}
	}
	public void calc(int w, int h){
		String[][] roomR = new String[w][h];
		String[][] roomL = new String[w][h];
		int xR = 0;
		int yR = 0;
		int xL = 0;
		int yL = 0;
		for(int j = 0; j < h; j++){
			String l = sc.next();
			String r = sc.next();
			for(int i = 0; i < w; i++){
				roomR[i][j] = r.substring(i, i+1);
				roomL[i][j] = l.substring(i, i+1);
				if(roomR[i][j].equals("R")){
					xR = i; yR = j;
				}
				if(roomL[i][j].equals("L")){
					xL = i; yL = j;
				}
			}
		}
		int[] moveXR = {0, -1, 0, 1};
		int[] moveY = {-1, 0, 1, 0};
		int[] moveXL = {0, 1, 0, -1};
		
		int[][][][] memo = new int[w][h][w][h];
		memo[xR][yR][xL][yL] = 1;
		
		ArrayList<int[]> list = new ArrayList<int[]>();
		list.add(new int[]{xR, yR, xL, yL});
		
		boolean ans = false;
		
		while(list.size() != 0){
			int[] now = list.get(0);
			list.remove(0);
			for(int k = 0; k < 4; k++){
				int nXR = now[0] + moveXR[k];
				int nYR = now[1] + moveY[k];
				int nXL = now[2] + moveXL[k];
				int nYL = now[3] + moveY[k];
				if(nXR < 0) nXR = 0;
				if(nXR >= w) nXR = w - 1;
				if(nYR < 0) nYR = 0;
				if(nYR >= h) nYR = h - 1;
				if(nXL < 0) nXL = 0;
				if(nXL >= w) nXL = w - 1;
				if(nYL < 0) nYL = 0;
				if(nYL >= h) nYL = h - 1;
				
				boolean goalR = false;
				boolean goalL = false;
				if(roomR[nXR][nYR].equals("#")){
					nXR = now[0]; nYR = now[1];
				}
				else if(roomR[nXR][nYR].equals("%")){
					goalR = true;
				}
				if(roomL[nXL][nYL].equals("#")){
					nXL = now[2]; nYL = now[3];
				}
				else if(roomL[nXL][nYL].equals("%")){
					goalL = true;
				}
				
				if(goalR && goalL){
					ans = true;
					break;
				}
				else if((!goalR && !goalL) && memo[nXR][nYR][nXL][nYL] != 1){
					memo[nXR][nYR][nXL][nYL] = 1;
					list.add(new int[]{nXR, nYR, nXL, nYL});
				}
			}
		}
		if(ans){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}