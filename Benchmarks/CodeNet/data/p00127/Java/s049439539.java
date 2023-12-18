import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main byakko = new Main();
		String string, encode, source = "";
		
		while((string = reader.readLine()) != null){
			encode = "";
			if(string.length() % 2 != 0) string += "0";
			for(int i = 0; i < string.length() - 1; i += 2){
				source = byakko.pocketPager(string.substring(i, i + 2));
				if(source.equals("NA")) break;
				else encode += source;
			}
			if(source.equals("NA")) System.out.println("NA");
			else System.out.println(encode);
		}
		reader.close();
	}
	
	public String pocketPager(String source){
		if(source.equals("11")) return "a";
		if(source.equals("12")) return "b";
		if(source.equals("13")) return "c";
		if(source.equals("14")) return "d";
		if(source.equals("15")) return "e";
		if(source.equals("21")) return "f";
		if(source.equals("22")) return "g";
		if(source.equals("23")) return "h";
		if(source.equals("24")) return "i";
		if(source.equals("25")) return "j";
		if(source.equals("31")) return "k";
		if(source.equals("32")) return "l";
		if(source.equals("33")) return "m";
		if(source.equals("34")) return "n";
		if(source.equals("35")) return "o";
		if(source.equals("41")) return "p";
		if(source.equals("42")) return "q";
		if(source.equals("43")) return "r";
		if(source.equals("44")) return "s";
		if(source.equals("45")) return "t";
		if(source.equals("51")) return "u";
		if(source.equals("52")) return "v";
		if(source.equals("53")) return "w";
		if(source.equals("54")) return "x";
		if(source.equals("55")) return "y";
		if(source.equals("61")) return "z";
		if(source.equals("62")) return ".";
		if(source.equals("63")) return "?";
		if(source.equals("64")) return "!";
		if(source.equals("65")) return " ";
		return "NA";
	}
}