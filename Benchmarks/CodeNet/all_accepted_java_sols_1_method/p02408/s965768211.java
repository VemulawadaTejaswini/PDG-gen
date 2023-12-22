import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String lineN = br.readLine();
    int n = Integer.parseInt(lineN);
		int[][] c = new int[4][13];
    for(int i = 0; i < n; i++){
      String[] lineA = br.readLine().split(" ");
      int num = Integer.parseInt(lineA[1]);
      if( lineA[0].equals("S") ) c[0][--num] =1;
      if( lineA[0].equals("H") ) c[1][--num] =1;
      if( lineA[0].equals("C") ) c[2][--num] =1;
      if( lineA[0].equals("D") ) c[3][--num] =1;
    }
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				if( c[i][j] == 0 ){
					switch(i){
						case 0:
							sb.append("S ");
							break;
						case 1:
							sb.append("H ");
							break;
						case 2:
							sb.append("C ");
							break;
						case 3:
							sb.append("D ");
							break;
					}
					sb.append(j+1).append("\n");
				}
			}
		}
    System.out.print(sb);
	}
}