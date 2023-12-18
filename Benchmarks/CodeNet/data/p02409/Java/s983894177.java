import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		String input = br.readLine();
		int n = Integer.parseInt(input);
		int i = 0;
		int j = 0;
		int k = 0;

		int room[][][] = new int[4][3][10];
		for( i=0 ; i<4; i++ ){
			for( j=0 ; j<3 ; j++ ){
				for ( k=0 ; k<10 ; k++ ){
					room[i][j][k]=0;
				}
			}
		}

		for( i=0 ; i<n ; i++){
			String[] reinput = br.readLine().split(" ");
			int b = Integer.parseInt(reinput[0])-1;
			int f = Integer.parseInt(reinput[1])-1;
			int r = Integer.parseInt(reinput[2])-1;
			int v = Integer.parseInt(reinput[3]);
			room[b][f][r] = room[b][f][r] + v;
		}

		for( i=0 ; i<4 ; i++ ){
			for( j=0 ; j<3 ; j++ ){
				for( k=0 ; k<10 ; k++ ){
					sb.append(" ").append(Integer.toString(room[i][j][k]));
				}
				sb.append("\n");
			}
			if( i==3 ) break;
			sb.append("####################\n");
		}

		System.out.print(sb);
	}
}