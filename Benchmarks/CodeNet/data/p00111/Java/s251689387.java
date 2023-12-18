import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static Map<Character,String> first_map = new HashMap<Character,String>(32);
	private static Map<String,String> second_map = new HashMap<String,String>(32);
	
	private static void init(){
		first_map.put('A' , "00000");
		first_map.put('B' , "00001");
		first_map.put('C' , "00010");
		first_map.put('D' , "00011");
		first_map.put('E' , "00100");
		first_map.put('F' , "00101");
		first_map.put('G' , "00110");
		first_map.put('H' , "00111");
		first_map.put('I' , "01000");
		first_map.put('J' , "01001");
		first_map.put('K' , "01010");
		first_map.put('L' , "01011");
		first_map.put('M' , "01100");
		first_map.put('N' , "01101");
		first_map.put('O' , "01110");
		first_map.put('P' , "01111");
		first_map.put('Q' , "10000");
		first_map.put('R' , "10001");
		first_map.put('S' , "10010");
		first_map.put('T' , "10011");
		first_map.put('U' , "10100");
		first_map.put('V' , "10101");
		first_map.put('W' , "10110");
		first_map.put('X' , "10111");
		first_map.put('Y' , "11000");
		first_map.put('Z' , "11001");
		first_map.put(' ' , "11010");
		first_map.put('.' , "11011");
		first_map.put(',' , "11100");
		first_map.put('-' , "11101");
		first_map.put('\'' , "11110");
		first_map.put('?' , "11111");
		
		second_map.put("101" , " ");
		second_map.put("000000" , "'");
		second_map.put("000011" , ",");
		second_map.put("10010001" , "-");
		second_map.put("010001" , ".");
		second_map.put("000001" , "?");
		second_map.put("100101" , "A");
		second_map.put("10011010" , "B");
		second_map.put("0101" , "C");
		second_map.put("0001" , "D");
		second_map.put("110" , "E");
		second_map.put("01001" , "F");
		second_map.put("10011011" , "G");
		second_map.put("010000" , "H");
		second_map.put("0111" , "I");
		second_map.put("10011000" , "J");
		second_map.put("0110" , "K");
		second_map.put("00100" , "L");
		second_map.put("10011001" , "M");
		second_map.put("10011110" , "N");
		second_map.put("00101" , "O");
		second_map.put("111" , "P");
		second_map.put("10011111" , "Q");
		second_map.put("1000" , "R");
		second_map.put("00110" , "S");
		second_map.put("00111" , "T");
		second_map.put("10011100" , "U");
		second_map.put("10011101" , "V");
		second_map.put("000010" , "W");
		second_map.put("10010010" , "X");
		second_map.put("10010011" , "Y");
		second_map.put("10010000" , "Z");
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		init();
		
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			StringBuilder sb_f = new StringBuilder();
			StringBuilder sb_s = new StringBuilder();
			for(char c:str.toCharArray()){
				sb_f.append(first_map.get(c));
			}
			
			String fir = sb_f.toString();
			
			
			while(true){
				boolean hit = false;
				for(String s : second_map.keySet()){
					if(fir.startsWith(s)){
						sb_s.append(second_map.get(s));
						fir = fir.substring(s.length(),fir.length());
						hit = true;
						break;
					}
				}
				
				if(!hit){
					break;
				}
			}
			
			System.out.println(sb_s);
		}
	}
}