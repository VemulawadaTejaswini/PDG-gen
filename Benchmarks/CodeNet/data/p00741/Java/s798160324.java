import java.util.Scanner;
import java.util.BitSet;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		while (true) {
			int width = stdin.nextInt();
			int height = stdin.nextInt();
			if (width == 0 && height == 0) break;
			stdin.nextLine();
			Map map = new Map(width, height);
			for (int i = 0; i < height; i++) {
				map.readMap(stdin.nextLine(), i);
			}
			System.out.println(map.islands());
		}
		System.exit(0);
	}
}

class Map {
	private BitSet land;
	private int width, height;
	public Map(int width, int height) {
		this.width = width;
		this.height = height;
		land = new BitSet(width * height);
	}

	public void readMap(String line, int i) {
		String[] l = line.split(" ");
		for (int j = 0; j < width; j++)
			if (l[j].equals("1")) land.set(i * width + j);
	}

	public int islands() {
		int n = 0;
		for (int i = 0; i < land.size(); i++) {
			if (land.get(i)) {
				n++;
				paint(i);
			} 
		}
		return n;
	}

	private void paint(int i) {	
		land.set(i, false);
		boolean islefterbound = i % width == 0;
		boolean isupperbound = i < width;
		boolean isrighterbound = i % width == width - 1;
		boolean islowerbound = i / width == height - 1;
		if (! islefterbound && ! isupperbound && land.get(i-width-1)) paint(i-width-1);
		if (! isupperbound && land.get(i-width)) paint(i-width);
		if (! isrighterbound && ! isupperbound && land.get(i-width+1)) paint(i-width+1);
		if (! islefterbound && land.get(i-1)) paint(i-1);
		if (! isrighterbound && land.get(i+1)) paint(i+1);
		if (! islefterbound && ! islowerbound && land.get(i+width-1)) paint(i+width-1);
		if (! islowerbound && land.get(i+width)) paint(i+width);
		if (! isrighterbound && ! islowerbound && land.get(i+width+1)) paint(i+width+1);
	}
}