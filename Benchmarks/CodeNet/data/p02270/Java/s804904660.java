import java.io.*;

class Main {
	public static void main(String[] args) {
		 BufferedReader br = new BufferedReader(new
		 InputStreamReader(System.in));

		try {
			
			String str = br.readLine();
			int n = Integer.parseInt(str.split(" ")[0]);
			int k = Integer.parseInt(str.split(" ")[1]);
			int[] in = new int[n];
			int total = 0;
			for (int i = 0; i < n; i++) {
				in[i] = Integer.parseInt(br.readLine());
				total += in[i];
			}

			int[] track = new int[k];
			int j = 0;
			for (int i = 0; i < n; i++) {

				track[j] += in[i];
				if (track[j] >= total / k)
					j++;

			}
			sortA(track);

			System.out.println(track[0]);

		} catch (IOException e) {
			System.out.println("error");

		}

	}

	static void sortA(int[] in) {
		if (in.length > 1) {
			int tmp = 0;
			for (int i = 0; i < in.length - 1; i++) {
				for (int j = i + 1; j < in.length; j++) {
					if (in[i] < in[j]) {
						tmp = in[j];
						in[j] = in[i];
						in[i] = tmp;
					}
				}
			}
		}
	}
}