import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter("EOF");
		char[] charArray = scan.next().toCharArray();
		int count = 0;
		int limit = charArray.length;
		while (count < limit) {
			int box[] = new int[4];
			int i = 0;
			int head = 0;
			int[] x = new int[4];
			while (count < limit) {
				if (charArray[count] == '1') {
					box[i] = count;
					x[i] = head;
					i++;
					if(i > 3) break;
				}
				if (charArray[count] != '0' && charArray[count] != '1')
					head = 0;
				else
					head++;
				count++;
			}
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
	}

}