import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		String x = "";
		String ins = "";
		try {
			x = in.readLine();
			ins = in.readLine();
			Dice d = new Dice (x.split(" "));
			
			for (int i = 0; i < ins.length(); i++) {
				d.move(ins.charAt(i));
			}
			System.out.println(d.getTop());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doMain(String x[], String i) {
		
	}
}

class Dice {
	char t, b, n, s, e, w;
	
	public Dice(String[] num) {
		t = (char)Integer.parseInt(num[0]);
		b = (char)Integer.parseInt(num[1]);
		n = (char)Integer.parseInt(num[2]);
		s = (char)Integer.parseInt(num[3]);
		e = (char)Integer.parseInt(num[4]);
		w = (char)Integer.parseInt(num[5]);
	}
	
	public void move(char c) {
		char tmp = 0;
		switch (c) {
		case 'N' :
			tmp = t;
			t = s;
			s = b;
			b = n;
			n = tmp;
			break;
		case 'S' :
			tmp = t;
			t = n;
			n = b;
			b = s;
			s = tmp;
			break;
		case 'E' :
			tmp = t;
			t = w;
			w = b;
			b = e;
			e = tmp;
			break;
		case 'W' :
			tmp = t;
			t = e;
			e = b;
			b = w;
			w = tmp;
			break;
		}
	}
	
	public char getTop() {
		return t;
	}
}