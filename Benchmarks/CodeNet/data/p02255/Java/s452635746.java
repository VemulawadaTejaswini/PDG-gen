import java.io.BufferedReader;
import java.io.InputStreamReader;

//?????\?????????
public class Main{

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

		int n = readInt(r);
		String[] numArrayStr = r.readLine().split(" ");

		int[] numArrayInt = new int[n];
		for(int i = 0; i < n; i++){
			numArrayInt[i] = Integer.parseInt(numArrayStr[i]);
		}

		printBlank(numArrayInt);

		for(int y = 1; y < n; y++){
			int kijun = numArrayInt[y];
			int j = y - 1;
			while(j >= 0 && numArrayInt[j] > kijun){
				numArrayInt[j + 1] = numArrayInt[j];
				j--;
			}
			numArrayInt[j + 1] = kijun;
			printBlank(numArrayInt);
		}

	}

	public static int readInt(BufferedReader r) throws Exception{
        return Integer.parseInt(r.readLine());
    }

	public static void printBlank(int[] numArrayInt){
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < numArrayInt.length; i++){
			builder.append(numArrayInt[i]);
			builder.append(" ");
		}

		System.out.println(builder.toString().trim());
	}

}