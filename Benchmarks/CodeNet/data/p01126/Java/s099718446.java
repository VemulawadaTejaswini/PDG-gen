import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		try {
			while((line = in.readLine()) != null) {
				int m = Integer.valueOf(line.split(" ")[1]);
				int a = Integer.valueOf(line.split(" ")[2]);
				if(m == 0) break;
				List<Line> l = new ArrayList<Line>();
				
				for(int i = 0; i < m; i++) l.add(new Line(in.readLine().split(" ")));
				
				java.util.Collections.sort(l);
				for(Line ll : l) a = ll.transit(a);
				System.out.println(a);
			}
			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
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