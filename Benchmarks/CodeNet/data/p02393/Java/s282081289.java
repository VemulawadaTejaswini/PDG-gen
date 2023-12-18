import java.io.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		String numbers[] = input.split(" ");
		Integer a = Integer.parseInt(numbers[0]);
		Integer b = Integer.parseInt(numbers[1]);
		Integer c = Integer.parseInt(numbers[2]);
		Integer result[] = {a, b, c};
		if(result[0] > result[1]){
			Integer first = result[0];
			Integer second = result[1];
			result[0] = second;
			result[1] = first;
		}

		if(result[1] > result[2]){
			Integer first = result[1];
			Integer second = result[2];
			result[1] = second;
			result[2] = first;
		}

		if(result[0] > result[1]){
			Integer first = result[0];
			Integer second = result[1];
			result[0] = second;
			result[1] = first;
		}
		
		System.out.println(result[0] + " " + result[1] + " " + result[2]);

	}

}