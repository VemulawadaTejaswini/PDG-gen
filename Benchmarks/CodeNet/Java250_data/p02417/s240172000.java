import java.io.*;
import java.util.*;

class Alphabet{
	char ch;
	int count = 0;
	boolean with = false;
	static List<Alphabet> abc = new ArrayList<Alphabet>();

	Alphabet(char ch){
		this.ch = ch;
	}
}


public class Main{
	public static void main(String[] args) throws IOException{
		char a = 'a';
		for (int i = 0; i < 26; i++){
			Alphabet.abc.add(new Alphabet(a++));
		}

				
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str;
	
		while((str = br.readLine()) != null){
			for(char c: str.toCharArray()){
				if(Character.isUpperCase(c)){
					c = Character.toLowerCase(c);
				}

				for (Alphabet x : Alphabet.abc){
					if(c == x.ch){
						x.with = true;
						x.count ++;
					}	
				}
			}
		}			

		for(Alphabet x : Alphabet.abc){
			System.out.println(x.ch + " : " + x.count);
		}
	}
}