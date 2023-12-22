import java.util.Scanner;

public class Main {
	
	static final int MAX_N = 1000;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] basedata = sc.nextLine().split(" ");
        int N = Integer.parseInt(basedata[0]);
        int X = Integer.parseInt(basedata[1]);
        int minAmount = MAX_N;
        int totalAmount = 0;
        for (int i = 0; i < N; i++) {
        	int amount = sc.nextInt();
        	totalAmount += amount;
        	if (amount < minAmount) 
        		minAmount = amount;
        }
        int remainder = X - totalAmount;
        System.out.println((remainder/minAmount) + N);
    }
}