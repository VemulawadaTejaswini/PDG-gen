import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

class List {
	ArrayList<Integer> number = new ArrayList<Integer>();
	ArrayList<Integer> score = new ArrayList<Integer>();
	int max_score,max_n;

	List() {
		max_score = 0;
		max_n = 0;
	}
	void add(int n,int s) {
		number.add(n);
		score.add(s);
		if (s>max_score) {
			max_score = s;
			max_n = n;
		} else if (s==max_score) {
			if (max_n>n) max_n = n;
		}
	}
	void MaxPrint() {
		System.out.println(max_n+" "+max_score);
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int n = Integer.parseInt(br.readLine());
			List list = new List();
			for (int i=0;i<n;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int number = Integer.parseInt(st.nextToken());
				int score = Integer.parseInt(st.nextToken());
				list.add(number,score);
			}
			list.MaxPrint();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}