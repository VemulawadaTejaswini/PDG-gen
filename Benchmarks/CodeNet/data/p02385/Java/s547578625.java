import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		String x = "";
		try {
			x = in.readLine();
			Dice d = new Dice (x.split(" "));
			d.judge(in.readLine().split(" "));
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
	private int[][] list;
	
	public Dice(String[] num) {
		t = Integer.parseInt(num[0]);
		s = Integer.parseInt(num[1]);
		e = Integer.parseInt(num[2]);
		w = Integer.parseInt(num[3]);
		n = Integer.parseInt(num[4]);
		b = Integer.parseInt(num[5]);
		
		makeList();
	}
	
	public void judge(String[] num) {
		int at = Integer.parseInt(num[0]);
		int as = Integer.parseInt(num[1]);
		int ae = Integer.parseInt(num[2]);
		int aw = Integer.parseInt(num[3]);
		int an = Integer.parseInt(num[4]);
		int ab = Integer.parseInt(num[5]);
		
		for (int i = 0; i < 24; i++) {
			if ((list[i][0] == at) && (list[i][0] == as) && (list[i][0] == ae)
					&& (list[i][0] == aw) && (list[i][0] == an) && (list[i][0] == ab)){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
	
	public void makeList() {
		list = new int[24][6];

		int i = 0;
		for (int j = 0; j < 4; j++) {
			move('R');
			list[i * 6 + j][0] = t;
			list[i * 6 + j][1] = s;
			list[i * 6 + j][2] = e;
			list[i * 6 + j][3] = w;
			list[i * 6 + j][4] = n;
			list[i * 6 + j][5] = b;
		}
		
		i++;
		move('N');
		for (int j = 0; j < 4; j++) {
			move('R');
			list[i * 6 + j][0] = t;
			list[i * 6 + j][1] = s;
			list[i * 6 + j][2] = e;
			list[i * 6 + j][3] = w;
			list[i * 6 + j][4] = n;
			list[i * 6 + j][5] = b;
		}
		
		i++;
		move('W');
		for (int j = 0; j < 4; j++) {
			move('R');
			list[i * 6 + j][0] = t;
			list[i * 6 + j][1] = s;
			list[i * 6 + j][2] = e;
			list[i * 6 + j][3] = w;
			list[i * 6 + j][4] = n;
			list[i * 6 + j][5] = b;
		}
		
		i++;
		move('W');
		move('W');
		for (int j = 0; j < 4; j++) {
			move('R');
			list[i * 6 + j][0] = t;
			list[i * 6 + j][1] = s;
			list[i * 6 + j][2] = e;
			list[i * 6 + j][3] = w;
			list[i * 6 + j][4] = n;
			list[i * 6 + j][5] = b;
		}

		i++;
		move('E');
		for (int j = 0; j < 4; j++) {
			move('R');
			list[i * 6 + j][0] = t;
			list[i * 6 + j][1] = s;
			list[i * 6 + j][2] = e;
			list[i * 6 + j][3] = w;
			list[i * 6 + j][4] = n;
			list[i * 6 + j][5] = b;
		}
		
		i++;
		
		move('N');
		for (int j = 0; j < 4; j++) {
			move('R');
			list[i * 6 + j][0] = t;
			list[i * 6 + j][1] = s;
			list[i * 6 + j][2] = e;
			list[i * 6 + j][3] = w;
			list[i * 6 + j][4] = n;
			list[i * 6 + j][5] = b;
		}
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
		case 'R' :
			tmp = n;
			n = w;
			w = s;
			s = e;
			e = tmp;
			break;
		}
	}

	public int getTop() {
		return t;
	}
}