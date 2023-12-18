import java.util.*;

class Main{
	public static void main(String[] args){
		Hashtable<String, String> hash = hashFormat();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.nextLine();
			String code = "";
			for(int i = 0; i < s.length(); i++){
				code += tobyte(s.charAt(i));
			}
			System.out.println(decode(code, hash));
		}
		sc.close();
	}
	static String tobyte(char c){
		switch(c){
			case ' ':
				c = 'Z'+1;
				break;
			case '.':
				c = 'Z'+2;
				break;
			case ',':
				c = 'Z'+3;
				break;
			case '-':
				c = 'Z'+4;
				break;
			case '\'':
				c = 'Z'+5;
				break;
			case '?':		
				c = 'Z'+6;
				break;
		}
		String s = Integer.toBinaryString(c-'A');
		return String.format("%05d", Integer.valueOf(s));
	}
	static Hashtable<String, String> hashFormat(){
		Hashtable<String, String> h = new Hashtable<String, String>();
		h.put("101", " ");
		h.put("000000","\'");
		h.put("000011", ",");
		h.put("10010001", "-");
		h.put("010001", ".");
		h.put("000001", "?");
		h.put("100101", "A");
		h.put("10011010", "B");
		h.put("0101", "C");
		h.put("0001", "D");
		h.put("110", "E");
		h.put("01001", "F");
		h.put("10011011", "G");
		h.put("010000", "H");
		h.put("0111", "I");
		h.put("10011000", "J");
		h.put("0110", "K");
		h.put("00100", "L");
		h.put("10011001", "M");
		h.put("10011110", "N");
		h.put("00101", "O");
		h.put("111", "P");
		h.put("10011111", "Q");
		h.put("1000", "R");
		h.put("00110", "S");
		h.put("00111", "T");
		h.put("10011100", "U");
		h.put("10011101", "V");
		h.put("000010", "W");
		h.put("10010010", "X");
		h.put("10010011", "Y");
		h.put("10010000", "Z");
		return h;
	}
	static String decode(String s, Hashtable<String, String> hash){
		String decoded = "";
		while(s != ""){
			String tmp = "";
			while(tmp != null && !hash.containsKey(tmp)){
				if(s == ""){
					tmp = null;
				}else{
					tmp += s.charAt(0);
					if(s.length() > 1){
						s = s.substring(1, s.length());
					}else{
						s = "";
					}
				}
			}
			if(tmp != null){
				decoded += (String)hash.get(tmp);
			}
		}
		return decoded;
	}
}