import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
//		System.out.println(getBinary('A'));
//		System.out.println(getBinary('P'));
//		System.out.println(getBinary('Z'));
//		System.out.println(getBinary(' '));
//		System.out.println(getBinary('?'));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		TransMap tm = new TransMap();
		
		while(true){
			String str = br.readLine();

			if(str == null){
				break;
			}
			StringBuffer sb = new StringBuffer();
			for(int i = 0 ; i < str.length() ;i++){
				sb.append(getBinary(str.charAt(i)));
			}
			
			//System.out.println(sb);
			
			int start = 0;
			int end = 1;
			while(start < sb.length() - 1 && end < sb.length()){
				String sub = sb.substring(start, end);
				
				char tmpc = tm.translate(sub);
				if(tmpc != '\0'){
					System.out.print(tmpc);
					start = end;
					end = start + 1;
				}
				else {
					end++;
				}
			}
			System.out.println();
		}

	}

	static String getBinary(char c){
		if(c >= 'A' && c <= 'Z'){
			String tmpStr = Integer.toBinaryString(c-'A');
			if(tmpStr.length() >= 5){
				return tmpStr.substring(tmpStr.length() - 5, tmpStr.length());
			}
			else {
				Formatter fm = new Formatter();
				fm.format("%05d", Integer.parseInt(tmpStr));
				return fm.toString();
			}
		}
		
		switch (c){
		case ' ':
			return "11010";
		case '.':
			return "11011";
		case ',':
			return "11100";
		case '-':
			return "11101";
		case '\'':
			return "11110";
		case '?':
			return "11111";
			
		}
		return null;
	}
}

class TransMap {
	private HashMap<String, Character> map;
	
	public TransMap(){
		map = new HashMap<String, Character>();
		
		map.put("101", ' ');
		map.put("000000", '\'');
		map.put("000011", ',');
		map.put("10010001", '-');
		map.put("010001", 'A');
		map.put("10011010", 'B');
		map.put("0101", 'C');
		map.put("0001", 'D');
		map.put("110", 'E');
		map.put("01001", 'F');
		map.put("10011011", 'G');
		map.put("010000", 'H');
		map.put("0111", 'I');
		map.put("10011000", 'J');
		map.put("0110", 'K');
		map.put("00100", 'L');
		map.put("10011001", 'M');
		map.put("10011110", 'N');
		map.put("00101", 'O');
		map.put("111", 'P');
		map.put("10011111", 'Q');
		map.put("1000", 'R');
		map.put("00110", 'S');
		map.put("00111", 'T');
		map.put("10011100", 'U');
		map.put("10011101", 'V');
		map.put("000010", 'W');
		map.put("10010010", 'X');
		map.put("10010011", 'Y');
		map.put("10010000", 'Z');

	}
	
	public char translate(String input){
		if(map.containsKey(input)){
			return map.get(input);
		}
		
		else {
			return '\0';
		}
	}
}