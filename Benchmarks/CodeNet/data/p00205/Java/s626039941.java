import java.io.*;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		int k[] = new int[5];
		int res[] = new int[5];
		int data[] = new int[3];

		try {
			while (!(buf = br.readLine()).equals("0")) {
				for (int i=0;i<3;i++) {
					data[i] = 0;
				}
				k[0] = Integer.parseInt(buf);
				data[k[0]-1] = 1;
				for (int i=1;i<5;i++) {
					k[i] = Integer.parseInt(br.readLine());
					data[k[i]-1] = 1;
				}
				if (data[0]==1&&data[1]==1&&data[2]==1) {
					for (int i=0;i<5;i++) res[i] = 3;
				} else if (data[0]==1&&data[1]==1) {
					for (int i=0;i<5;i++) {
						if (k[i]==1) res[i] = 1;
						else res[i] = 2;
					}
				} else if (data[0]==1&&data[2]==1) {
					for (int i=0;i<5;i++) {
						if (k[i]==1) res[i] = 2;
						else res[i] = 1;
					}
				} else if (data[1]==1&&data[2]==1) {
					for (int i=0;i<5;i++) {
						if (k[i]==2) res[i] = 1;
						else res[i] = 2;
					}
				} else {
					for (int i=0;i<5;i++) res[i] = 3;
				}
				for (int i=0;i<5;i++) System.out.println(res[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}