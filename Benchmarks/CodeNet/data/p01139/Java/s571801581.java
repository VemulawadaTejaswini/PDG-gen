import java.util.*;
public class Main { 
	public static boolean[][] wMap;
	public static boolean[][] bMap;
	public static boolean[][] wxMap;
	public static boolean[][] bxMap;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int w = stdIn.nextInt();
			int h = stdIn.nextInt();
			if(w == 0 && h == 0) break;
			wMap = new boolean[h][w];
			bMap = new boolean[h][w];
			wxMap = new boolean[h][w];
			bxMap = new boolean[h][w];
			for(int i = 0; i < h; i++) {
				String tmp = stdIn.next();
				for(int j = 0; j < w; j++) {
					if(tmp.charAt(j) == 'W') {
						wMap[i][j] = true;
					}
					else if(tmp.charAt(j) == 'B') {
						bMap[i][j] = true;
					}
				}
			}
			
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(wMap[i][j]) {
						solvW(i+1,j);
						solvW(i-1,j);
						solvW(i,j+1);
						solvW(i,j-1);
					}
					if(bMap[i][j]) {
						solvB(i+1,j);
						solvB(i-1,j);
						solvB(i,j+1);
						solvB(i,j-1);
					}
				}
			}
			int wc = 0;
			int bc = 0;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(wxMap[i][j] && !bxMap[i][j] &&checkW(i,j)) {
						wc++;
					}
					else if(bxMap[i][j] && !wxMap[i][j] && checkB(i,j)) {
						bc++;
					}
				}
			}
			System.out.println(bc + " "+ wc);
			
		}
	}
	public static void solvW(int i, int j) {
		if(i < 0 || j < 0 || i >= wMap.length || j >= wMap[i].length) return;
		if(wMap[i][j] || bMap[i][j]) return;
		if(wxMap[i][j]) return;
		boolean isChange = false;
		if(i != 0 && (wxMap[i-1][j] || wMap[i-1][j])) {
			wxMap[i][j] = true;
			isChange = true;
		}
		else if(j != 0 && (wxMap[i][j-1] || wMap[i][j-1])) {
			wxMap[i][j] = true;
			isChange = true;
		}
		else if(i != wxMap.length-1 && (wxMap[i+1][j] || wMap[i+1][j])) {
			wxMap[i][j] = true;
			isChange = true;
		}
		else if(j != wxMap[i].length-1 && (wxMap[i][j+1] || wMap[i][j+1])) {
			wxMap[i][j] = true;
			isChange = true;
		}
		
		if(!isChange) return;
		solvW(i+1,j);
		solvW(i-1,j);
		solvW(i,j+1);
		solvW(i,j-1);
	}
	public static void solvB(int i, int j) {
		if(i < 0 || j < 0 || i >= bMap.length || j >= bMap[i].length) return;
		if(wMap[i][j] || bMap[i][j]) return;
		if(bxMap[i][j]) return;
		boolean isChange = false;
		if(i != 0 && (bxMap[i-1][j] || bMap[i-1][j])) {
			bxMap[i][j] = true;
			isChange = true;
		}
		else if(j != 0 && (bxMap[i][j-1] || bMap[i][j-1])) {
			bxMap[i][j] = true;
			isChange = true;
		}
		else if(i != bxMap.length-1 && (bxMap[i+1][j] || bMap[i+1][j])) {
			bxMap[i][j] = true;
			isChange = true;
		}
		else if(j != bxMap[i].length-1 && (bxMap[i][j+1] || bMap[i][j+1])) {
			bxMap[i][j] = true;
			isChange = true;
		}
		
		if(!isChange) return;
		solvB(i+1,j);
		solvB(i-1,j);
		solvB(i,j+1);
		solvB(i,j-1);
	}
	
	public static boolean checkW(int i, int j) {
		if(i != 0 && bMap[i-1][j]) {
			return false;
		}
		else if(j != 0 && bMap[i][j-1]) {
			return false;
		}
		else if(i != bMap.length-1 && bMap[i+1][j]) {
			return false;
		}
		else if(j != bMap[i].length-1 && bMap[i][j+1]) {
			return false;
		}
		return true;
	}
	public static boolean checkB(int i, int j) {
		if(i != 0 && wMap[i-1][j]) {
			return false;
		}
		else if(j != 0 && wMap[i][j-1]) {
			return false;
		}
		else if(i != wMap.length-1 && wMap[i+1][j]) {
			return false;
		}
		else if(j != wMap[i].length-1 && wMap[i][j+1]) {
			return false;
		}
		return true;
	}
}