import java.io.*;
import java.util.*;

public class Main{
	public String[] data0 = new String[]{
		"A", "B", "C", "D", "E", "F", "G", "H",
		"I", "J", "K", "L", "M", "N", "O", "P",
		"Q", "R", "S", "T", "U", "V", "W", "X",
		"Y", "Z", " ", ".", ",", "-", "'", "?"
	};

	public String[] data1 = new String[]{
		"00000", "00001", "00010", "00011",
		"00100", "00101", "00110", "00111",
		"01000", "01001", "01010", "01011",
		"01100", "01101", "01110", "01111",
		"10000", "10001", "10010", "10011",
		"10100", "10101", "10110", "10111",
		"11000", "11001", "11010", "11011",
		"11100", "11101", "11110", "11111"
	};

	public String[] data2 = new String[]{
		"101", "000000", "000011", "10010001",
		"010001", "000001", "100101", "10011010",
		"0101", "0001", "110", "01001",
		"10011011", "010000", "0111", "10011000",
		"0110", "00100", "10011001", "10011110",
		"00101", "111", "10011111", "1000",
		"00110", "00111", "10011100", "10011101",
		"000010", "10010010", "10010011", "10010000"
	};

	public String[] data3 = new String[]{
		" ", "'", ",", "-", ".", "?", "A", "B",
		"C", "D", "E", "F", "G", "H", "I", "J",
		"K", "L", "M", "N", "O", "P", "Q", "R",
		"S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<String> Ans = new ArrayList<String>();
		String line;

		while((line = in.readLine()) != null){

			String line1 = "";
			for(int i=0; i<line.length(); i++){
				String l = line.substring(i, i+1);
				for(int n=0; n<data0.length; n++){
					if(l.equals(data0[n])){
						line1 += data1[n];
					}
				}
			}

			String line2 = "";
			String str = "";
			for(int i=0; i<line1.length(); i++){
				str += line1.substring(i, i+1);
				for(int n=0; n<data2.length; n++){
					if(str.equals(data2[n])){
						line2 += data3[n];
						str = "";
					}
				}
			}

			Ans.add(line2);
		}

		for(int i=0; i<Ans.size(); i++){
			System.out.println(Ans.get(i));
		}
	}
}