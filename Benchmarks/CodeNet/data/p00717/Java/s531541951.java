import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0 )break;
			else calc(n);
			
		}
	}
	public void calc(int n){
		ArrayList<ArrayList<int[]>> list = new ArrayList<ArrayList<int[]>>();;
		for(int i = 0; i < n + 1; i++){
			int m = sc.nextInt();
			ArrayList<int[]> l = new ArrayList<int[]>();
			for(int j = 0; j < m; j++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				l.add(new int[]{x,y});
			}
			list.add(l);
		}

		ArrayList<int[]> base = list.get(0);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int i = 1; i < n + 1; i++){
			ArrayList<int[]> oresen = list.get(i);
			if(oresen.size() == base.size()){
				boolean t = true;

				for(int j = 0; j < oresen.size()-2; j++){
					int[] zahyouB = base.get(j);
					int[] zahyouB2 = base.get(j+1);
					int[] zahyouB3 = base.get(j+2);
					int[] zahyouO = oresen.get(j);
					int[] zahyouO2 = oresen.get(j+1);
					int[] zahyouO3 = oresen.get(j+2);

					int nagasaB = Math.max(Math.abs(zahyouB2[0] - zahyouB[0]), Math.abs(zahyouB2[1] - zahyouB[1])); 
					int nagasaO = Math.max(Math.abs(zahyouO2[0] - zahyouO[0]), Math.abs(zahyouO2[1] - zahyouO[1])); 
					int nagasaB2 = Math.max(Math.abs(zahyouB3[0] - zahyouB2[0]), Math.abs(zahyouB3[1] - zahyouB2[1]));
					int nagasaO2 = Math.max(Math.abs(zahyouO3[0] - zahyouO2[0]), Math.abs(zahyouO3[1] - zahyouO2[1])); 
					int[] i1 = new int[]{(zahyouB2[0] - zahyouB[0]) / nagasaB , (zahyouB2[1] - zahyouB[1]) / nagasaB};
					int[] i2 = new int[]{(zahyouB3[0] - zahyouB2[0]) / nagasaB2 , (zahyouB3[1] - zahyouB2[1]) / nagasaB2};
					int[] i3 = new int[]{(zahyouO2[0] - zahyouO[0]) / nagasaO , (zahyouO2[1] - zahyouO[1]) / nagasaO};
					int[] i4 = new int[]{(zahyouO3[0] - zahyouO2[0]) / nagasaO2 , (zahyouO3[1] - zahyouO2[1]) / nagasaO2};
					if(kakudo(i1, i2) != kakudo(i3, i4) || nagasaB != nagasaO || nagasaB2 != nagasaO2) {
						t = false;
						break;
					}
				}
				if(t) ans.add(i);
				else{
					t = true;
					for(int j = 0; j < oresen.size()-2; j++){
						int[] zahyouB = base.get(j);
						int[] zahyouB2 = base.get(j+1);
						int[] zahyouB3 = base.get(j+2);
						int[] zahyouO = oresen.get(oresen.size() - j - 1);
						int[] zahyouO2 = oresen.get(oresen.size() - j - 2);
						int[] zahyouO3 = oresen.get(oresen.size() - j - 3);

						int nagasaB = Math.max(Math.abs(zahyouB2[0] - zahyouB[0]), Math.abs(zahyouB2[1] - zahyouB[1])); 
						int nagasaO = Math.max(Math.abs(zahyouO2[0] - zahyouO[0]), Math.abs(zahyouO2[1] - zahyouO[1])); 
						int nagasaB2 = Math.max(Math.abs(zahyouB3[0] - zahyouB2[0]), Math.abs(zahyouB3[1] - zahyouB2[1]));
						int nagasaO2 = Math.max(Math.abs(zahyouO3[0] - zahyouO2[0]), Math.abs(zahyouO3[1] - zahyouO2[1])); 
						int[] i1 = new int[]{(zahyouB2[0] - zahyouB[0]) / nagasaB , (zahyouB2[1] - zahyouB[1]) / nagasaB};
						int[] i2 = new int[]{(zahyouB3[0] - zahyouB2[0]) / nagasaB2 , (zahyouB3[1] - zahyouB2[1]) / nagasaB2};
						int[] i3 = new int[]{(zahyouO2[0] - zahyouO[0]) / nagasaO , (zahyouO2[1] - zahyouO[1]) / nagasaO};
						int[] i4 = new int[]{(zahyouO3[0] - zahyouO2[0]) / nagasaO2 , (zahyouO3[1] - zahyouO2[1]) / nagasaO2};
						if(kakudo(i1, i2) != kakudo(i3, i4) || nagasaB != nagasaO || nagasaB2 != nagasaO2) {
							t = false;
							break;
						}
					}
					if(t) ans.add(i);
				}
			}
		}
		for(int i = 0; i < ans.size(); i++){
			System.out.println(ans.get(i));
		}
		
		System.out.println("+++++");
	}
	
	public int kakudo(int[] n1, int[] n2){
		ArrayList<int[]> l = new ArrayList<int[]>();
		l.add(new int[]{1, 0});
		l.add(new int[]{0, 1});
		l.add(new int[]{-1, 0});
		l.add(new int[]{0, -1});
		int i1 = 0;
		int i2 = 0;
		for(int i = 0; i < 4; i++){
			if(l.get(i)[0] == n1[0] && l.get(i)[1] == n1[1]) i1 = i;
			if(l.get(i)[0] == n2[0] && l.get(i)[1] == n2[1]) i2 = i;
		}
		int t = i2 - i1;
		if(t >= 4) t = t - 4;
		if(t < 0) t = t + 4;
		return t;
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}