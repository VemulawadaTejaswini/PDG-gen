import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int space = sc.nextInt();

			String[][] room = new String[n][m];

			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					room[i][j] = sc.next();
				}
			}

			int count=0;
			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					
					if (room[i][j].equals(".")) {
						if (i<n-space) {
							boolean flag = true;
							for (int k=0; k<space-1; k++) {
								if (!room[i][j].equals(room[i+k][j])) flag = false;
								//System.out.println(i+"/" + j +"   "+room[i][j] + "    " +room[i+k][j] + "  " + flag);
							}
							if (flag) count++;
						}
						if (j<m-space) {
							boolean flag = true;
							for (int k=0; k<space-1; k++) {
								if (!room[i][j].equals(room[i][j+k])) flag = false;
								//System.out.println(i+"/" + j +room[i][j] + "    " +room[i][j+k] + "  " + flag);
							}
							if (flag) count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
