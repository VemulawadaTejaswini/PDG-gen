import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		String s, temp = null;
		int mt_num,p1,p2,n;
		
		n = Integer.parseInt(br.readLine());  // 山の数入力
		
		String[][] blocks = new String[n + 1][1001];
		ArrayList<String> ans = new ArrayList<String>();
		
		for (int i = 0; i < blocks.length; i++) {
			for (int j = 0; j < blocks[i].length; j++) {
				blocks[i][j] = "";
			}
		}
		
		while(true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			s = st.nextToken();
			if (s.equals("quit")) break;
			
			// ==========push============================
			if (s.equals("push")) {
				
				mt_num = Integer.parseInt(st.nextToken());
				
				for (int i = 0; i < 1001; i++) {
					if (blocks[mt_num][i].equals("")) {
						blocks[mt_num][i] = st.nextToken();
						break;
					}
				}
				continue;
			}
			//===========================================
			
			// ==========pop=============================
			if (s.equals("pop")) {
				
				mt_num = Integer.parseInt(st.nextToken());
				for (int i = 0; i < 1001; i++) {
					if(blocks[mt_num][i].equals("")) {
						ans.add(blocks[mt_num][i - 1]);
						blocks[mt_num][i - 1] = "";
						break;
					}
				}
				
				continue;
			}
			//============================================
			
			// ==========move============================
			p1 = Integer.parseInt(st.nextToken());
			p2 = Integer.parseInt(st.nextToken());
			for (int i = 0; i < 1001; i++) {
				if(blocks[p1][i].equals("")) {
					temp = blocks[p1][i - 1];
					blocks[p1][i - 1] = "";
					break;
				}
			}
			for (int i = 0; i < 1001; i++) {
				if(blocks[p2][i].equals("")) {
					blocks[p2][i] = temp;
					break;
				}
			}
			//===========================================
			
		}
		for (String a : ans) {
			System.out.println(a);
		}
		
	}
	
}