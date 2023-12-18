import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
public class Main {

	public static void main(String[] args) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String col = "0";	//入力する行数
		String[] cols = null;
		int colInt = 0;

		//行数の入力後、三角形の三辺の長さを入力
		try {
			col = br.readLine();
			colInt = Integer.parseInt(col);
			cols = new String[colInt];

			for(int i = 0;i < colInt;i++){
				cols[i] = br.readLine();
			}
		}catch(IOException e){

		}

		//値の分離
		int[][] triangle = new int[colInt][3];
		for(int i = 0;i < colInt;i++){
			String[] temp = cols[i].split(" ");
			triangle[i][0] = Integer.parseInt(temp[0]);
			triangle[i][1] = Integer.parseInt(temp[1]);
			triangle[i][2] = Integer.parseInt(temp[2]);
		}
		for(int i = 0;i < colInt;i++){
			//三角形ごとに、最長の辺を求める
			int maxIndex = 0;
			if(triangle[i][maxIndex] < triangle[i][1]){
				maxIndex = 1;
			}
			if(triangle[i][maxIndex] < triangle[i][2]){
				maxIndex = 2;
			}
			//三角形が直角三角形であるかを求める
			switch (maxIndex){
			case 0:
				if(Math.pow(triangle[i][0],2) == Math.pow(triangle[i][1],2) + Math.pow(triangle[i][2],2)){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
				break;
			case 1:
				if(Math.pow(triangle[i][1],2) == Math.pow(triangle[i][0],2) + Math.pow(triangle[i][2],2)){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
				break;
			case 2:
				if(Math.pow(triangle[i][2],2) == Math.pow(triangle[i][0],2) + Math.pow(triangle[i][1],2)){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
				break;
			}

		}
	}
}