import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Substring ss;
		int n,m;
		n = sc.nextInt();
		m = sc.nextInt();
		ss = new Substring(sc.next());
		for(int i=0; i<m; i++) {
			ss.moveCursor(sc.next());
		}
		System.out.println(ss.getNums());
	}
}

class Substring {
	private char[] c;
	private int l,r;
	private ArrayList<String> al;
	
	public Substring(String s) {
		c = s.toCharArray();
		l = 0;
		r = 0;
		al = new ArrayList<String>();
	}
	
	public int getNums() {
		return al.size();
	}
	
	public void moveCursor(String command) {
		if(command.equals("R++")) {
			r++;
		} else if(command.equals("L++")) {
			l++;
		} else if(command.equals("R--")) {
			r--;
		} else if(command.equals("L--")) {
			l--;
		}
		addSubstring();
	}
	
	private void addSubstring() {
		char[] sub = Arrays.copyOfRange(c, l, r+1);
		String str = String.valueOf(sub);
		if(!al.contains(str)) {
			al.add(str);
		}
	}
}