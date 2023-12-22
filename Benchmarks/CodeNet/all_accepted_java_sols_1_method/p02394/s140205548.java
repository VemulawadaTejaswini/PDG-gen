import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

			String[] line = br.readLine().split(" ");
			int W = Integer.parseInt(line[0]);
			int H = Integer.parseInt(line[1]);
			int x = Integer.parseInt(line[2]);
			int y = Integer.parseInt(line[3]);
			int r = Integer.parseInt(line[4]);

			boolean X = false;
			boolean Y = false;

			if(r <= x && x <= W - r) {
				X = true;
			}
			if(r <= y && y <= H - r) {
				Y = true;
			}
			if(X && Y) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
	}
}