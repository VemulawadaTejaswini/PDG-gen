import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		String O = io.next();
		String E = io.next();
		StringBuffer buffer = new StringBuffer();
		int Oi=0,Ei=0;
		while(Oi<O.length()){
			buffer.append(O.charAt(Oi));
			Oi ++;
			if(Ei>=E.length()) break;
			buffer.append(E.charAt(Ei));
			Ei ++;
		};
		
		System.out.println(buffer.toString());
		
	}	
}	