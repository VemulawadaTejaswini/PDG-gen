import java.io.*;
import java.util.*;

class alphabetCounter {
	
	private int count = 0;
	private char alphabet;
	
	alphabetCounter(char a){
		alphabet = a;
	}

	public void incrementCount(){
		count++;
	}
	
	public char getAlphabet(){
		return alphabet;
	}

	public int getCount(){
		return count;
	}
}

public class Main {
	public static void main(String[] args) {

		char[] Letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
							'n','o','p','q','r','s','t','u','v','w','x','y','z'};

		ArrayList<alphabetCounter> al = new ArrayList<alphabetCounter>();
		for (char l : Letters){
			al.add(new alphabetCounter(l));
		}
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				String s;
				if((s = in.readLine()) == null){
					break;
				}
							
				s.toLowerCase(Locale.ENGLISH);

				for(int i = 0; i < s.length(); i++ ){
					char c = s.charAt(i);

					for(alphabetCounter ac : al){
						if(ac.getAlphabet() == c){
							ac.incrementCount();
							break;
						}
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

		for(alphabetCounter ac : al){
			System.out.println(ac.getAlphabet() + " : " + ac.getCount());
		}
	}
}