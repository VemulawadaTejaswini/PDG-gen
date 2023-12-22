import java.util.Scanner;

class Main {
	public static void main(String[] $){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int r[] = new int[n];
		int g[] = new int[n];
		int b[] = new int[n];
		String sArray[] = new String[n];
		sArray = s.split("");

		String tmp = "";
		r[0] = 0;
		g[0] = 0;
		b[0] = 0;
		tmp = String.valueOf(sArray[0]);
		if ("R".equals(tmp)) {
			r[0] = 1;
		} else if ("G".equals(tmp)) {
			g[0] = 1;
		} else if ("B".equals(tmp)) {
			b[0] = 1;
		}

		for (int i = 1; i < n; i++) {
			tmp = sArray[i];

			r[i] = r[i - 1];
			g[i] = g[i - 1];
			b[i] = b[i - 1];
			if ("R".equals(tmp)) {
				r[i] = r[i - 1] + 1;
			} else if ("G".equals(tmp)) {
				g[i] = g[i - 1] + 1;
			} else if ("B".equals(tmp)) {
				b[i] = b[i - 1] + 1;
			}
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (sArray[i].equals(sArray[j]))
					continue;
				if (!sArray[i].equals("R") && !sArray[j].equals("R")) {
					sum += r[n - 1] - r[j];
					if (j - i + j < n && "R".equals(sArray[j - i + j])) sum--;
				} else if (!sArray[i].equals("G") && !sArray[j].equals("G")) {
					sum += g[n - 1] - g[j];
					if (j - i + j < n && "G".equals(sArray[j - i + j])) sum--;
				} else if (!sArray[i].equals("B") && !sArray[j].equals("B")) {
					sum += b[n - 1] - b[j];
					if (j - i + j < n && "B".equals(sArray[j - i + j])) sum--;
 				}
			}
		}

		System.out.println(sum);

		sc.close();
	}
}


