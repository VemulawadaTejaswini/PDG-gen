import java.io.*;
import java.util.*;

public class Main {
	static public void main(String[] argv) {
		try{
			//FileReader file_in = new FileReader("test.txt");
			//BufferedReader d = new BufferedReader( file_in );
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
	
			while(true) {
				String buf = d.readLine();
				
				int num = Integer.valueOf(buf);
				if(num == 0) break;
				
				Converter converter = new Converter();
				
				for(int i = 0; i < num; i++) {
					buf = d.readLine();
					converter.addElement(buf);
				}
				
				buf = d.readLine();
				num = Integer.valueOf(buf);
				
				for(int i = 0; i < num; i++) {
					buf = d.readLine();
					char c = buf.charAt(0);
					converter.printCharConverted(c);
				}
				
				System.out.println();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Converter {
	class Dictionary {
		public char _key;
		public char _converted;
	}
	
	ArrayList<Dictionary> _dictionary;
	
	public Converter() {
		_dictionary = new ArrayList<Dictionary>();
	}
	
	void addElement(char key, char converted) {
		Dictionary element = new Dictionary();
		element._key = key ;
		element._converted = converted;
		_dictionary.add( element );
	}
	
	void addElement(String str) {
		StringTokenizer st = new StringTokenizer(str);
		char key = st.nextToken().charAt(0);
		char converted = st.nextToken().charAt(0);
		addElement(key, converted);
	}
	
	void printCharConverted(char c) {
		for(int i = 0; i < _dictionary.size(); i++) {
			Dictionary element = _dictionary.get(i);
			if( c == element._key ) {
				System.out.print(element._converted);
				return;
			}
		}
		System.out.print(c);
	}
}