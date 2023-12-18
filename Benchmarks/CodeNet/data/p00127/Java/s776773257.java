import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PocketPager pp;
		while(sc.hasNextLine()){
			pp = new PocketPager();
			System.out.println(pp.getMsg(sc.nextLine()));
		}
	}
}

class PocketPager{
	private static String msg;
	
	PocketPager(){
		msg = "";
	}
	
	public static String getMsg(String str){
		if(str.length()%2 != 0){
			return "NA";
		}
		
		return toMsg(str);
	}
	
	private static String toMsg(String str){
		for(int i=0;i<str.length();i+=2){
			if(str.charAt(i) == '1'){
				if(str.charAt(i+1) == '1'){
					msg += "a";
				}else if(str.charAt(i+1) == '2'){
					msg += "b";
				}else if(str.charAt(i+1) == '3'){
					msg += "c";
				}else if(str.charAt(i+1) == '4'){
					msg += "d";
				}else if(str.charAt(i+1) == '5'){
					msg += "e";
				}else{
					return "NA";
				}
			}else if(str.charAt(i) == '2'){
				if(str.charAt(i+1) == '1'){
					msg += "f";
				}else if(str.charAt(i+1) == '2'){
					msg += "g";
				}else if(str.charAt(i+1) == '3'){
					msg += "h";
				}else if(str.charAt(i+1) == '4'){
					msg += "i";
				}else if(str.charAt(i+1) == '5'){
					msg += "j";
				}else{
					return "NA";
				}
			}else if(str.charAt(i) == '3'){
				if(str.charAt(i+1) == '1'){
					msg += "k";
				}else if(str.charAt(i+1) == '2'){
					msg += "l";
				}else if(str.charAt(i+1) == '3'){
					msg += "m";
				}else if(str.charAt(i+1) == '4'){
					msg += "n";
				}else if(str.charAt(i+1) == '5'){
					msg += "o";
				}else{
					return "NA";
				}
			}else if(str.charAt(i) == '4'){
				if(str.charAt(i+1) == '1'){
					msg += "p";
				}else if(str.charAt(i+1) == '2'){
					msg += "q";
				}else if(str.charAt(i+1) == '3'){
					msg += "r";
				}else if(str.charAt(i+1) == '4'){
					msg += "s";
				}else if(str.charAt(i+1) == '5'){
					msg += "t";
				}else{
					return "NA";
				}
			}else if(str.charAt(i) == '5'){
				if(str.charAt(i+1) == '1'){
					msg += "u";
				}else if(str.charAt(i+1) == '2'){
					msg += "v";
				}else if(str.charAt(i+1) == '3'){
					msg += "w";
				}else if(str.charAt(i+1) == '4'){
					msg += "x";
				}else if(str.charAt(i+1) == '5'){
					msg += "y";
				}else{
					return "NA";
				}
			}else if(str.charAt(i) == '6'){
				if(str.charAt(i+1) == '1'){
					msg += "z";
				}else if(str.charAt(i+1) == '2'){
					msg += ".";
				}else if(str.charAt(i+1) == '3'){
					msg += "?";
				}else if(str.charAt(i+1) == '4'){
					msg += "!";
				}else if(str.charAt(i+1) == '5'){
					msg += " ";
				}else{
					return "NA";
				}
			}else{
				return "NA";
			}
		}
		
		return msg;
	}
}