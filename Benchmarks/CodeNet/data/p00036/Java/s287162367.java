import java.io.IOException;

public class Main {
	

	public static void main(String[] args) {
		try {
			final int SIZE = 20 + 10 * 8 * ((8 + 4) * 8);// 8桁＋終端　を　8行に＋空行を10回
			byte[] buf = new byte[SIZE];// 入力データをすべて格納する
			int count = 0;// 文字の先頭からの順番
			int limit = System.in.read(buf, 0, SIZE);

			while (count < limit) {
				int box[] = new int[4];
				int i = 0;
				int head = 0;
				int[] x = new int[4];
				while (count < limit) {
					if (buf[count] == '1') {
						box[i] = count;
						x[i] = head;
						i++;
						
					}
					if (buf[count] != '0' && buf[count] != '1')
						head = 0;
					else
						head++;
					count++;
					if(i > 3) break;
				}
				
				if(i != 4 ) break;
				
				if (box[0] == box[1] - 1) {
					// ACEG
					switch (x[2] - x[0]) {
					case -1:
						System.out.println("G");
						break;
					case 0:
						System.out.println("A");
						break;
					case 1:
						System.out.println("E");
						break;
					case 2:
						System.out.println("C");
						break;
					}
				} else {
					// BDF
					switch (x[3] - x[0]) {
					case -1:
						System.out.println("D");
						break;
					case 0:
						System.out.println("B");
						break;
					case 1:
						System.out.println("F");
						break;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}