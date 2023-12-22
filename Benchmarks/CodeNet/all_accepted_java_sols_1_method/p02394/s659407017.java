import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str = br.readLine();

		String[] inputData = str.split(" ");

		int data[] = new int[inputData.length];

		//String??????inputData???int???????????£????????????
		for(int i=0;i < data.length;i++){
			data[i] = Integer.parseInt(inputData[i]);
		}

		//W,H,x,y,r data[0,1,2,3,4]
		//x-r<0 or x+r>W ??? NO
		//y-r<0 or y+r>H ??? Yes

		if(data[2]-data[4] < 0 | data[2]+data[4] > data[0] | data[3]-data[4] < 0 | data[3]+data[4] > data[1]){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}

	}
}