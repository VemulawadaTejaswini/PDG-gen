import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int value[] = new int[n];
        for (int i = 0; i < n; i++) {
        	value[i] = scanner.nextInt();
        }
        for (int i = value.length-1; i >= 0; i--) {
        	if (i < value.length-1) System.out.print(" ");
        	System.out.print(value[i]);
        }
        System.out.println();
    }
}

