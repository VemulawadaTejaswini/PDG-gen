import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		int[][][] room = new int[4][3][10];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n_input = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n_input; i++) {
			String[] sz_line = (br.readLine()).split(" ");
			int block = Integer.parseInt(sz_line[0]) -1;
			int floor = Integer.parseInt(sz_line[1]) -1;
			int room_number = Integer.parseInt(sz_line[2]) -1;
			
			room[block][floor][room_number] += Integer.parseInt(sz_line[3]);
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 10; k++) {
					System.out.print(" " + room[i][j][k]);
				}
				System.out.println();
			}
			if (i < 3) {
				System.out.println("####################");
			}
		}
	}
}