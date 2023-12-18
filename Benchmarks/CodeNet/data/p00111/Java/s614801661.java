import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String[] c000 = new String[]{"'","?","W",","};
			String[] c10010 = new String[]{"Z","-","X","Y"};
			String[] c10011 = new String[]{"J","M","B","G","U","V","N","Q"};
			
			String s = sc.nextLine();
			StringBuffer stn = new StringBuffer();
			StringBuffer ans = new StringBuffer();
			String t, u, v, w;
			int p;
			
			for(int i=0;i<s.length();i++){
				p = s.codePointAt(i);
				if(p==32) stn.append("11010");
				else if(p==46) stn.append("11011");
				else if(p==44) stn.append("11100");
				else if(p==45) stn.append("11101");
				else if(p==39) stn.append("11110");
				else if(p==63) stn.append("11111");
				else{
					t = Integer.toBinaryString(p-65);
					for(int j=0;j<5-t.length();j++) stn = stn.append("0");
					stn.append(t);
				}
			}
			
			for(int i=0;i<stn.length();i++){
				while(true){
					p = ans.length();
					t = stn.substring(i,i+3);
					if(t.compareTo("101")==0) ans.append(" ");
					else if(t.compareTo("110")==0) ans.append("E");
					else if(t.compareTo("111")==0) ans.append("P");
					if(p<ans.length() || i+3==stn.length()){
						i+=2;
						break;
					}
	
					u = stn.substring(i,i+4);
					if(u.compareTo("0001")==0) ans.append("D");
					else if(u.compareTo("0101")==0) ans.append("C");
					else if(u.compareTo("0110")==0) ans.append("K");
					else if(u.compareTo("0111")==0) ans.append("I");
					else if(u.compareTo("1000")==0) ans.append("R");
					if(p<ans.length() || i+4==stn.length()){
						i+=3;
						break;
					}
					
					v = stn.substring(i,i+5);
					if(v.compareTo("01001")==0) ans.append("F");
					else if(v.compareTo("00100")==0) ans.append("L");
					else if(v.compareTo("00101")==0) ans.append("O");
					else if(v.compareTo("00110")==0) ans.append("S");
					else if(v.compareTo("00111")==0) ans.append("T");
					if(p<ans.length() || i+5==stn.length()){
						i+=4;
						break;
					}
					
					w = stn.substring(i,i+6);
					if(t.compareTo("000")==0) ans.append(c000[(stn.codePointAt(i+4)-48)*2 + (stn.codePointAt(i+5)-48)]);
					else if(w.compareTo("010000")==0) ans.append("H");
					else if(w.compareTo("010001")==0) ans.append(".");	
					else if(w.compareTo("100101")==0) ans.append("A");	
					if(p<ans.length() || i+7==stn.length()){
						i+=5;
						break;
					}
					
					if(v.compareTo("10010")==0) ans.append(c10010[(stn.codePointAt(i+6)-48)*2 + (stn.codePointAt(i+7)-48)]);
					else if(v.compareTo("10011")==0) ans.append(c10011[(stn.codePointAt(i+5)-48)*4 + (stn.codePointAt(i+6)-48)*2 + (stn.codePointAt(i+7)-48)]);
					i+=7;
					break;
				}		
			}
			System.out.println(ans);
		}
	}	
}