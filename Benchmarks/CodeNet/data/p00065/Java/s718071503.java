import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Customer {
	int n,c;

	Customer(int n,int c) {
		this.n = n;
		this.c = c;
	}

	boolean NotUsed() {
		if (this.n==-1) return true;
		return false;
	}

	void Set(int n) {
		this.n = n;
	}

	void count() {
		this.c++;
	}
}

class List {
	Customer ct[] = new Customer[1000];

	List() {
		for (int i=0;i<1000;i++) {
			ct[i] = new Customer(-1,0);
		}
	}

	void addNewNumber(int n) {
		for (int i=0;i<1000;i++) {
			if (ct[i].NotUsed()) {
				ct[i].Set(n);
				ct[i].count();
				for (int j=i;j>0;j--) {
					if (ct[j].n<ct[j-1].n) {
						Customer t = ct[j-1];
						ct[j-1] = ct[j];
						ct[j] = t;
					} else break;
				}
				break;
			}
			else if (this.ct[i].n==n) {
				ct[i].count();
				break;
			}
		}
	}

	void Search(List list) {
		for (int i=0;i<1000;i++) {
			if (this.ct[i].NotUsed()) break;
			for (int j=0;j<1000;j++) {
				if (list.ct[j].NotUsed()) break;
				if (this.ct[i].n==list.ct[j].n) System.out.println(this.ct[i].n+" "+(this.ct[i].c+list.ct[j].c));
			}
		}
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			List list[] = {new List(),new List()};
			while (!(buf = br.readLine()).equals("")) {
				StringTokenizer st = new StringTokenizer(buf,",");
				list[0].addNewNumber(Integer.parseInt(st.nextToken()));
			}
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf,",");
				list[1].addNewNumber(Integer.parseInt(st.nextToken()));
			}
			list[0].Search(list[1]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}