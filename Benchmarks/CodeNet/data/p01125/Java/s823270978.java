import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ans = new ArrayList<String>();
		
		while(true){
			int gn = Integer.parseInt(sc.nextLine());
			if(gn == 0) {
				break;
			}
			
			int[][] xy = new int[21][21];
			for(int i=0; i < 21; i++){
				for(int j=0; j < 21; j++){
					xy[i][j] = 0;
				}
			}
			
			for(int i=0; i < gn; i++){
				String[] gp = sc.nextLine().split(" ");
				xy[Integer.parseInt(gp[0])][Integer.parseInt(gp[1])] = 1;
			}
				
			int mn = Integer.parseInt(sc.nextLine());
			String[] mt = new String[mn];
			int[] mc = new int[mn];
					
			for(int i=0; i < mn; i++){
				String[] mp = sc.nextLine().split(" ");
				mt[i] = mp[0];
				mc[i] = Integer.parseInt(mp[1]);
			}
			
			ans.add(run(xy,mt,mc));
		}	
		
		for(int i=0; i < ans.size(); i++){
			System.out.println(ans.get(i));
		}
		sc.close();
	}
	
	
	static String run(int[][] xy,String[] mt,int[] mc){
		int xpoint = 10;
		int ypoint = 10;
		for(int i=0; i < mt.length; i++){
			if(mt[i].equals("N")){
				for(int j=0;  j < mc[i]; j++){
					xy[xpoint][++ypoint] = 0;
				}
		    }else if(mt[i].equals("E")) {
				for(int j=0; j < mc[i]; j++){
					xy[++xpoint][ypoint] = 0;
				}
			}else if(mt[i].equals("S"))	{
				for(int j=0; j < mc[i]; j++){
					xy[xpoint][--ypoint] = 0;
				}
			}else if(mt[i].equals("W")) {
				for(int j=0; j < mc[i]; j++){
					xy[--xpoint][ypoint] = 0;
				}
			}
		}
		return check(xy);
	}
	
	static String check(int[][] xy){
		for(int i=0; i < xy[0].length; i++){
			for(int j=0; j < xy.length; j++){
				if(xy[i][j] == 1) return "No";
			}
		}
		return "Yes";
	}
	
}