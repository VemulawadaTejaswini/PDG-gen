import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputNum = br.readLine().split(" ");
		//?¨????
		int W =Integer.parseInt(inputNum[0]);
		//??????
		int H =Integer.parseInt(inputNum[1]);
		//????????????????¨????
		int x =Integer.parseInt(inputNum[2]);
		//?????????????????????
		int y =Integer.parseInt(inputNum[3]);
		//?????????????????????
		int r =Integer.parseInt(inputNum[4]);

		if (x-r >= 0 && y-r >=0 && x+r <= W && y+r <= H){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}



	}

}