import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		int[] data = new int[n];
    	for (int i = 0; i < n; i++) {
    		data[i] = sc.nextInt();
    	}

    	int count = 0;
    	for (int i = 0; i < n; i++) {
    		for (int j = n - 1; j > i; j--) {
    			if (data[j] < data[j - 1]) {
    				int temp = data[j];
    				data[j] = data[j - 1];
    				data[j - 1] = temp;
    				count++;
    			}
    		}
    	}

    	printData(data);
    	System.out.println(count);

        sc.close();
	}

	private static void printData(int[] data) {
		StringBuffer printData = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			printData.append(data[i]);
			printData.append(" ");
		}
		printData.delete(printData.length() - 1, printData.length());
		System.out.println(printData);
	}
}