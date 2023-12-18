import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int w, n, a, b, tmp;
	int[] lots;
	String[] input;
	w = Integer.parseInt(scan.nextLine());
	n = Integer.parseInt(scan.nextLine());
	lots = new int[w + 1];
	for (int i = 1; i <= w; i++) {
	    lots[i] = i;
	}
	for (int i = 0; i < n; i++) {
	    input = scan.nextLine().split(",");
	    a = Integer.parseInt(input[0]);
	    b = Integer.parseInt(input[1]);
	    tmp = lots[a];
	    lots[a] = lots[b];
	    lots[b] = tmp;
	}
	for (int i = 1; i <= w; i++) {
	    System.out.println(lots[i]);
	}
    }
}