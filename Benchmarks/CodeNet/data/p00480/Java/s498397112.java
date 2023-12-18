import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		String[] in = null;
		int numToken = 0;
		ArrayList<Integer> tokens = new ArrayList<>();

		try { // read numToken
			line = input.readLine();
			numToken = Integer.parseInt(line);
		} catch (IOException e) {
			System.out.println("IOException");
		} catch (NumberFormatException e) {
			System.out.println("The first line isn't int");
		}

		try {
			line = input.readLine(); //read tokens
			in = line.split(" ");
			for (String str : in) {
				tokens.add(Integer.parseInt(str));
			}
			int firstToken = tokens.remove(0);

			/* solve */
			//make List
			long countInterimSol[] = new long[21];
			long countInterimSolTemp[] = new long[21];
			int interimSol;
			countInterimSol[firstToken] = 1; //prevent bag from (firstToken == 0)
			for (int token : tokens) {
				for(int i = 0; i <= 20; i++) {
					if(countInterimSol[i] == 0){ //should have no this if statement?
						continue;
					}
					interimSol = i + token;
					if(interimSol <= 20) {
						countInterimSolTemp[interimSol] += countInterimSol[i];
					}
					interimSol = i - token;
					if(interimSol >= 0) {
						countInterimSolTemp[interimSol] += countInterimSol[i];
					}
				}
				for(int i = 0; i <= 20; i++) {
					countInterimSol[i] = countInterimSolTemp[i];
				}
				Arrays.fill(countInterimSolTemp, 0);
			}

			System.out.println(countInterimSol[0]);

		} catch (IOException e) {
			System.out.println("IOException");
		} catch (NumberFormatException e) {
			System.out.println("The first line isn't int");
		}
	}
}
