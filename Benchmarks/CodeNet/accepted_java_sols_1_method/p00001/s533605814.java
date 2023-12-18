import java.util.Scanner;

class Main{
    public static void main(String[] a){

		Scanner scanner = new Scanner(System.in);
		int array[] = new int[10];
		int cnt = 0;
		
		while(cnt < 10) {
			int num = scanner.nextInt();
			array[cnt] = num;
			cnt++;
		}
		
		scanner.close();
		
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				if(array[j] < array[j+1]) {
					int max = array[j];
					array[j] = array[j+1];
					array[j+1] = max;
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(array[i]);
		}
		
    }
}
