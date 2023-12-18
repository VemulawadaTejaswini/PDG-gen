import java.io.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String input = br.readLine();
			String[] numbers = input.split(" ");
			Integer a = Integer.parseInt(numbers[0]);
			Integer b = Integer.parseInt(numbers[1]);
			if(a == 0 && b == 0){
				break;
			}
			for(int i=1; i <= a; i++){
				String line = "";
				for(int j=1; j <= b; j++){
					if(i == 1 || i == a || j == 1 || j == b){
						line += "#";
					}
					else{
						line += ".";
					}
				}
				System.out.println(line);
			}
			System.out.println("");
		}

	}

}