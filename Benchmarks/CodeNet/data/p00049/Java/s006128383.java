import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int human[] = new int[4];


			while((input =in.readLine()) != null) {

				String blood[] = input.split(",");

				if(blood[1].equals("A")){
					human[0]++;
				}
				if(blood[1].equals("B")){
					human[1]++;

				}
				if(blood[1].equals("O")){
					human[2]++;
				}
				if(blood[1].equals("AB")){
					human[3]++;
				}
			}


			for(int i = 0; i < 4; i++){

				System.out.println(human[i]);
			}
		}

	}