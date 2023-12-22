import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

		int n = readInt(r);
		String[] numArrayStr = r.readLine().split(" ");

		int[] numArrayInt = convertToInt(numArrayStr);

		selectSort(numArrayInt);
	}

	public static void selectSort(int[] numArrayInt) {
		int count = 0;
		for(int i = 0; i < numArrayInt.length; i++){
			int miny = i;
			for(int y = i; y < numArrayInt.length; y++){
				if(numArrayInt[y] < numArrayInt[miny]){
					miny = y;
				}
			}

			if(miny != i){
				int temp = numArrayInt[i];
				numArrayInt[i] = numArrayInt[miny];
				numArrayInt[miny] = temp;
				count++;
			}

		}
		printBlank(numArrayInt);
		System.out.println(count);
	}

	public static int readInt(BufferedReader r) throws Exception{
        return Integer.parseInt(r.readLine());
    }

	public static int[] convertToInt(String[] numArrayStr){
		int[] numArrayInt = new int[numArrayStr.length];
		for(int i = 0; i < numArrayStr.length; i++){
			numArrayInt[i] = Integer.parseInt(numArrayStr[i]);
		}
		return numArrayInt;
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