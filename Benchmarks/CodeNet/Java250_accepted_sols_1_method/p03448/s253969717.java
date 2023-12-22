import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();

		int count = 0;
		for(int numA = 0;numA <= a;numA++) {
		    for(int numB = 0;numB <= b;numB++) {
		        int numC = (x - (500 * numA + 100 * numB)) / 50;
		        int total = 500 * numA + 100 * numB + 50 * numC;
		        if(numC >= 0 && numC <= c && total == x) count++;
		    }
		}

		System.out.println(count);
    }
}