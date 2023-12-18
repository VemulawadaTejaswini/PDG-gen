import java.io.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public String[][] unit = new String[][]{
		{"*", " ", "=", " ", "*", "*", "*", "*"},
		{"*", " ", "=", "*", " ", "*", "*", "*"},
		{"*", " ", "=", "*", "*", " ", "*", "*"},
		{"*", " ", "=", "*", "*", "*", " ", "*"},
		{"*", " ", "=", "*", "*", "*", "*", " "},
		{" ", "*", "=", " ", "*", "*", "*", "*"},
		{" ", "*", "=", "*", " ", "*", "*", "*"},
		{" ", "*", "=", "*", "*", " ", "*", "*"},
		{" ", "*", "=", "*", "*", "*", " ", "*"},
		{" ", "*", "=", "*", "*", "*", "*", " "},
	};

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while((line = in.readLine()) != null){
			int num = Integer.parseInt(line);
			String[][] abacus = new String[5][];
			int div = 10000;
			int current = 0;
			for(int i=0; i<5; i++){
				int digit = (num - current) / div;
				current += digit * div;
				div /= 10;
				abacus[i] = unit[digit];
			}

			for(int j=0; j<8; j++){
				for(int i=0; i<5; i++){
					System.out.print(abacus[i][j]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}