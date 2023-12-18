import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input ="";
			do{
				input = br.readLine();
				String[] inputs = input.split(" ");
				int num1 = Integer.parseInt(inputs[0]);
				int num2 = Integer.parseInt(inputs[1]);
				System.out.println(getDigit(num1 + num2));
			}while(!input.equals(""));
		}
		catch(Exception e){
			return;
		}
	}
	
	private static int getDigit(int num){
		String numStr = Integer.toString(num);
		return numStr.length();
	}

}