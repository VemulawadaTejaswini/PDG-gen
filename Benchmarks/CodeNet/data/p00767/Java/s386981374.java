import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Rec> list = new ArrayList<Rec>();
		for (int h = 1; h <= 150; h++) {
			for (int w = h + 1; w <= 150; w++) {
				list.add(new Rec(h, w));
			}
		}
		Collections.sort(list);
		Scanner sc = new Scanner(System.in);
		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if (h == 0)
				break;
			int x = h * h + w * w;
			int i = list.indexOf(new Rec(h, w));
			Rec l = list.get(i++);
			System.out.println(l.h + " " + l.w);
		}
	}
}

class Rec implements Comparable<Rec> {
	int h, w;
	int x;

	Rec(int h, int w) {
		this.h = h;
		this.w = w;
		x = h * h + w * w;
	}

	@Override
	public int compareTo(Rec o) {
		if (x == o.x) {
			if (h == o.h)
				return 0;
			else if (h < o.h)
				return 1;
			else
				return -1;
		} else if (x > o.x)
			return 1;
		else
			return -1;
//		return Integer.compare(x, o.x);
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((Rec)obj).x == x;
	}
}