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
			String[] num = x.split(" ");
			Dice d = new Dice (num);

			ins = in.readLine();
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
}

class Dice {
	private int t, b, n, s, e, w;
	
	public Dice(String[] num) {
		t = Integer.parseInt(num[0]);
		s = Integer.parseInt(num[1]);
		e = Integer.parseInt(num[2]);
		w = Integer.parseInt(num[3]);
		n = Integer.parseInt(num[4]);
		b = Integer.parseInt(num[5]);
		System.out.println(t);
	}
	
	public void move(char c) {
		int tmp = 0;
		
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
		System.out.println(t);
	}
	
	public int getTop() {
		return t;
	}
}