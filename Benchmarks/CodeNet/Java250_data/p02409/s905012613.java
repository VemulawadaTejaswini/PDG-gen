import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][][] house = new int[3][10][4];
		String count = br.readLine();
		for(int i = 0 ; i < Integer.parseInt(count) ; i++){
			String info = br.readLine();
			String[] ia = info.split(" ");
			house[Integer.parseInt(ia[1])-1][Integer.parseInt(ia[2])-1][Integer.parseInt(ia[0])-1] += Integer.parseInt(ia[3]);
			                                                         
		}
		for(int i = 0 ; i < house[2][0].length ; i++){
			for(int j = 0 ; j < house.length ; j++){
				for(int k = 0 ; k < house[j].length ; k++){
					System.out.print(" " + house[j][k][i]);
				}
				System.out.println();
			}
			if(i != house[0][0].length-1) System.out.println("####################");
		}
	}

}