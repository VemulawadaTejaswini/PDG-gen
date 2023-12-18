import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lengthFirst = scanner.nextInt();
		int lengthSecond = scanner.nextInt();
		int maximum = scanner.nextInt();
		int result = 0;
		int[] books1 = new int[lengthFirst];
		int[] books2 = new int[lengthSecond];
		
		for(int i = 0; i < lengthFirst; i++)
			books1[i] = scanner.nextInt();
		for(int i = 0; i < lengthSecond; i++)
			books2[i] = scanner.nextInt();
		long sum = 0;
		int position1 = 0;
		int position2 = 0;
		for(int i = 0; i < lengthFirst + lengthSecond; i++) {
			if(books1[position1] > books2[position2]) {
				sum += books2[position2];
				position2++;
				if(position2 == lengthSecond) {
					books2[0] = (int) 1e9 + 1;
					position2 = 0;
				}
			}
			else if(books1[position1] < books2[position2]) {
				sum += books1[position1];
				position1++;
				if(position1 == lengthFirst) {
					books1[0] = (int) 1e9 + 1;
					position1 = 0;
				}
			}
			else if(books1[position1] == books2[position2]) {
				sum += books1[position1];
				position1++;
				if(position1 == lengthFirst) {
					books1[0] = (int) 1e9 + 1;
					position1 = 0;
				}
			}
			
			if(sum > maximum)
				break;
			result++;
		}
			
		System.out.println(result);
	}
}