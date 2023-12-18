import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Color {
	long id;
	int count;
	Color(long id) {
		this.id = id;
		this.count = 1;
	}
	void add() {
		this.count++;
	}
}

class Colors {
	ArrayList<Color> cs = new ArrayList<Color>();
	Colors() {}
	boolean add_and_search(long ci,int n) {
		boolean flag = true;
		for (int i=0;i<cs.size();i++) {
			if (cs.get(i).id==ci) {
				cs.get(i).add();
				if (cs.get(i).count>n/2) {
					System.out.println(cs.get(i).id);
					return true;
				}
				flag = false;
				break;
			}
		}
		if (flag) cs.add(new Color(ci));
		return false;
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0")) {
				int n = Integer.parseInt(buf);
				StringTokenizer st = new StringTokenizer(br.readLine());
				Colors c = new Colors();
				boolean end = false;
				for (int i=0;i<n;i++) {
					if (c.add_and_search(Long.parseLong(st.nextToken()),n)) {
						end = true;
						break;
					}
				}
				if (!end) System.out.println("NO COLOR");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}