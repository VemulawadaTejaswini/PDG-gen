import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	static int[][] map;
	
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		
		while(true){
			map = new int[12][];
			for(int i = 0; i < 12; i++)
				map[i] = app.toIntegerArrays(reader.readLine().toCharArray());
			
			int count = 0;
			for(int i = 0; i < 12; i++){
				for(int j = 0; j < 12; j++){
					if(map[i][j] == 1){
						app.check(i, j);
						count++;
					}
				}
			}
			System.out.println(count);
			
			if(reader.readLine() == null) break;
		}
		isr.close();
		reader.close();
	}
	
	public void check(int x, int y){
		if(x > 11 || y > 11 || x < 0 || y < 0 || map[x][y] == 0) return;
		map[x][y] = 0;
		check(x + 1, y);
		check(x - 1, y);
		check(x, y + 1);
		check(x, y - 1);
	}
	public int[] toIntegerArrays(char[] array){
		int[] result = new int[12];
		for(int i = 0; i < 12; i++) result[i] = Integer.parseInt(String.valueOf(array[i]));
		return result;
	}
	
}