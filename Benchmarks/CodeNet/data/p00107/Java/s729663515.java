import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String[] input = null;
		Cheese c = null;
		Gate g = null;
		while (true) {
			input = br.readLine().split(" ");
			int height = Integer.parseInt(input[1]);
			int width = Integer.parseInt(input[0]);
			int depth = Integer.parseInt(input[2]);
			if(height + width + depth == 0)	break;
			c = new Cheese(width, height, depth);
			int numGate = Integer.parseInt(br.readLine());
			for (int i = 0; i < numGate; i++) {
				g = new Gate(
						Integer.parseInt(br.readLine()));
				System.out.println((c.isSmaller(g)) ? "OK"
						: "NA");
			}
		}
	}
}

class Cheese {
	int width;
	int height;
	int depth;
	double lengthWH;
	double lengthHD;
	double lengthWD;

	public Cheese(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.lengthWH = Math.sqrt(this.width * this.width
				+ this.height * this.height);
		this.lengthHD = Math.sqrt(this.height * this.height
				+ this.depth * this.depth);
		this.lengthWD = Math.sqrt(this.width * this.width
				+ this.depth * this.depth);
	}

	public boolean isSmaller(Gate gate) {
		int gateDiameter = gate.getDiameter();
		return ((this.lengthHD < gateDiameter)
				|| (this.lengthWD < gateDiameter) || (this.lengthWH < gateDiameter));
	}
}

class Gate {
	int r;

	public Gate(int r) {
		this.r = r;
	}

	public int getDiameter() {
		return this.r * 2;
	}
}