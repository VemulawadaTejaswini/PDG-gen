import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main
{
	static final int MAX_X = 8;
	static final int MAX_Y = 8;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String s;
		do
		{
			int[][] map = new int[MAX_Y+1][MAX_X+2];
			for (int i=0; i<MAX_Y; i++) {
				s = br.readLine();
				for(int j=1; j<MAX_X+1; j++)
					map[i][j] = Integer.parseInt(s.charAt(j-1)+"");
			}
			System.out.println(figure(map));
		} while((s=br.readLine())!=null && s.isEmpty());
	}
	private static char figure(int[][] map)
	{
		for (int i = 0; i < MAX_Y; i++) {
			for (int j = 1; j < MAX_X+1; j++) {
				if(map[i][j]==1){
					if(map[i+1][j] == 1 && map[i][j+1]==1){
						if(map[i+1][j+1]==1)	return 'A';
						else 					return 'G';
					} else if(map[i+1][j] == 0 && map[i][j+1]==1){
						if(map[i+1][j+1]==1)	return 'E';
						else 					return 'C';						
					} else {
						if(map[i+1][j+1]==1)		return 'F';
						else if (map[i+1][j-1]==1)	return 'D';	
						else 						return 'B';
					}
				}
			}
		}
		return '0';
	}
}