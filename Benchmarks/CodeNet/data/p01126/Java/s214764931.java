import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int now = 1;
		int h = -1;
		List<Line> l = new ArrayList<Line>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = "";
			String sts[] = in.readLine().split(" ");
			for(int i = 0; i < Integer.valueOf(sts[1]); i++) l.add(new Line(s.split("\\s")));
			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		java.util.Collections.sort(l);
		for(Line ll : l) {
			if(h == -1 || ll.hight < h) h = ll.hight;
			now = ll.transit(now);
			if(h == 0) break;
		}
		System.out.println(now);
	}
}

class Line implements Comparable<Line> {
	int hight;
	int left;
	int right;
	
	public Line(String[] lines) {
		hight = Integer.valueOf(lines[0]);
		left = Integer.valueOf(lines[1]);
		right = Integer.valueOf(lines[2]);
	}
	
	public int transit(int now) {
		if(now == left) return right;
		else if(now == right) return left;
		return now;
	}
	
	@Override
	public int compareTo(Line o) {
		return o.hight - this.hight;
	}
}