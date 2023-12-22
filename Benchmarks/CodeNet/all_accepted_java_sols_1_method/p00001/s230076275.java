import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] data = new int[10];
		for (int i = 0; i < 10; i++) {
			data[i] = scan.nextInt();
		}

		int afterData, beforeIndex;
		
		for(int i = 1; i < 10; i++) {
			afterData = data[i];
			beforeIndex = i - 1;
			
			while (beforeIndex >= 0 && data[beforeIndex] > afterData) {
				data[beforeIndex + 1] = data[beforeIndex];
				beforeIndex--;
			}

			data[beforeIndex + 1] = afterData;			
		}
	
		System.out.println(data[9]);
		System.out.println(data[8]);		
		System.out.println(data[7]);

		scan.close();
	}

}