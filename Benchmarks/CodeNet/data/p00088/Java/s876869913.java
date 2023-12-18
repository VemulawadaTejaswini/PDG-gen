import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	HashMap<Character,String> map=new HashMap<Character, String>();

	public void run() {
		map.put(' ',"101");
		map.put('\'',"000000");
		map.put(',',"000011");
		map.put('-',"10010001");
		map.put('.',"010001");
		map.put('?',"000001");
		map.put('?',"000001");
		map.put('A',"100101");
		map.put('B',"10011010");
		map.put('C',"0101");
		map.put('D',"0001");
		map.put('E',"110");
		map.put('F',"01001");
		map.put('G',"10011011");
		map.put('H',"010000");
		map.put('I',"0111");
		map.put('J',"10011000");
		map.put('K',"0110");
		map.put('L',"00100");
		map.put('M',"10011001");
		map.put('N',"10011110");
		map.put('O',"00101");
		map.put('P',"111");
		map.put('Q',"10011111");
		map.put('R',"1000");
		map.put('S',"00110");
		map.put('T',"00111");
		map.put('U',"10011100");
		map.put('V',"10011101");
		map.put('W',"000010");
		map.put('X',"10010010");
		map.put('Y',"10010011");
		map.put('Z',"10010000");

		while(sc.hasNextLine()){
			String str=sc.nextLine();
			String str1="";
			String res="";
			for(char c:str.toCharArray()){
				str1+=map.get(c);
			}
			while(str1.length()%5!=0)str1+='0';

			for(int s=0,e=5;e<=str1.length();s+=5,e+=5){
				int val=Integer.parseInt(str1.substring(s,e),2);
				if(0<=val && val<26){
					res+=(char)('A'+val);
				}else{
					switch(val){
					case 26:res+=" ";break;
					case 27:res+=".";break;
					case 28:res+=",";break;
					case 29:res+="-";break;
					case 30:res+="'";break;
					case 31:res+="?";break;
					}
				}
			}
			ln(res);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}