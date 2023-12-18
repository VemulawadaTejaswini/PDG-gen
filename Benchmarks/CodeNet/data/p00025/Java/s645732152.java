import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] a){

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String tmpString = null;

		try {
			while(null != (tmpString = bf.readLine())){
				int[] numbersA = convert(tmpString);
				tmpString = bf.readLine();
				int[] numbersB = convert(tmpString);
				int count = numbersA.length;

				int hit = 0, blow = 0;
				for(int i = 0; i < count; i++){
					for(int j = 0; j < count; j++){
						if(numbersB[i] == numbersA[j]){
							if(i == j){
								hit++;
							} else {
								blow++;
							}
							break;
						}
					}
				}
				System.out.println(hit + " " + blow);
			}
		} catch (IOException e) {
		}
	}

	private static int[] convert(String text){
		String[] tmp = text.split(" ");
		int count = tmp.length;
		int[] retval = new int[count];
		for(int i = 0; i < count; i++){
			retval[i] = Integer.parseInt(tmp[i]);
		}
		return retval;
	}
}