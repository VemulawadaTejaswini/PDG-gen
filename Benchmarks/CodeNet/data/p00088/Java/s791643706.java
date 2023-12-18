//Volume0-0088
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	//declare
	private static HashMap<Character,String> CtoS = new HashMap<Character,String>();
	private static HashMap<String,Character> StoC = new HashMap<String,Character>();

	public static void main(String[] args) {

		int    mod;
		char[] ch;
		String s;

		//initialize
		initMap();

        //input
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	ch = sc.nextLine().toCharArray();

        	//calculate
        	s = "";
        	for(int i=0;i<ch.length;i++){
        		s += CtoS.get(ch[i]);
        	}
        	mod = s.length() % 5;
        	if(mod > 0){
        		for(int i=0;i<5-mod;i++){
        			s += "0";
        		}
        	}

        	//output
        	for(int i=0;i<s.length();i+=5){
        		System.out.print(StoC.get(s.substring(i, i+5)));
        	}
        	System.out.println();
        }
	}

	private static void initMap(){

		//initialize CtoS.
		CtoS.put(' ', "101");
		CtoS.put('\'',"000000");
		CtoS.put(',', "000011");
		CtoS.put('-', "10010001");
		CtoS.put('.', "010001");
		CtoS.put('?', "000001");
		CtoS.put('A', "100101");
		CtoS.put('B', "10011010");
		CtoS.put('C', "0101");
		CtoS.put('D', "0001");
		CtoS.put('E', "110");
		CtoS.put('F', "01001");
		CtoS.put('G', "10011011");
		CtoS.put('H', "010000");
		CtoS.put('I', "0111");
		CtoS.put('J', "10011000");
		CtoS.put('K', "0110");
		CtoS.put('L', "00100");
		CtoS.put('M', "10011001");
		CtoS.put('N', "10011110");
		CtoS.put('O', "00101");
		CtoS.put('P', "111");
		CtoS.put('Q', "10011111");
		CtoS.put('R', "1000");
		CtoS.put('S', "00110");
		CtoS.put('T', "00111");
		CtoS.put('U', "10011100");
		CtoS.put('V', "10011101");
		CtoS.put('W', "000010");
		CtoS.put('X', "10010010");
		CtoS.put('Y', "10010011");
		CtoS.put('Z', "10010000");

		//initialize StoC.
		StoC.put("00000",'A');
		StoC.put("00001",'B');
		StoC.put("00010",'C');
		StoC.put("00011",'D');
		StoC.put("00100",'E');
		StoC.put("00101",'F');
		StoC.put("00110",'G');
		StoC.put("00111",'H');
		StoC.put("01000",'I');
		StoC.put("01001",'J');
		StoC.put("01010",'K');
		StoC.put("01011",'L');
		StoC.put("01100",'M');
		StoC.put("01101",'N');
		StoC.put("01110",'O');
		StoC.put("01111",'P');
		StoC.put("10000",'Q');
		StoC.put("10001",'R');
		StoC.put("10010",'S');
		StoC.put("10011",'T');
		StoC.put("10100",'U');
		StoC.put("10101",'V');
		StoC.put("10110",'W');
		StoC.put("10111",'X');
		StoC.put("11000",'Y');
		StoC.put("11001",'Z');
		StoC.put("11010",' ');
		StoC.put("11011",'.');
		StoC.put("11100",',');
		StoC.put("11101",'-');
		StoC.put("11110",'\'');
		StoC.put("11111",'?');
	}
}