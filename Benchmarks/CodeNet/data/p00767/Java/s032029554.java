import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int h = nextInt();
			if (h == 0) {
				break;
			}
			int w = nextInt();

			int cross = h * h + w * w;
			int[] min = new int[3];
			min[0] = Integer.MAX_VALUE;
			for (int height = 1; height <= 150; height++) {
				int width = (int) Math.ceil(Math.sqrt(cross - height * height));
				if (height == h
						|| (height * height + width * width == cross && height < h)) {
					width++;
				}

				if (height >= width) {
					break;
				}
				if (min[0] > height * height + width * width) {
					min[0] = height * height + width * width;
					min[1] = height;
					min[2] = width;
				}
			}
			System.out.println(min[1] + " " + min[2]);

		}

	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

}