import java.util.ArrayList;
import java.util.List;

/**
 * @author ando
 *
 */
public class P2001 {
	
	public static void main(String[] args) {
		int now = 1;
		List<Line> l = new ArrayList<>();
		for(String line : args[0].split("\n")) l.add(new Line(line.split(" ")));
		l.remove(0);
		java.util.Collections.sort(l);
		for(Line ll : l) now = ll.transit(now);
		System.out.println(now);
		//System.out.println(args[0]);
	}
}

public class Line implements Comparable<Line> {
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
		if(this.hight == o.hight) return 0;
		if(this.hight < o.hight) return 1;
		return -1;
	}
}