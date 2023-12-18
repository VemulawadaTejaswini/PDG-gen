import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	int[] r = new int[n];
	for (int i = 0; i < n; i++) {
	    r[i] = Integer.parseInt(scan.nextLine());
	}
	int max = r[1];
	int maxIndex = 1;
	int min = r[0];
	int minIndex = 0;
	for (int i = 1, j = 0; i < n; i++, j++) {
	    if (max < r[i]) {
		max = r[i];
	    }
	    if (min > r[j]) {
		min = r[j];
	    }
	}
	System.out.println(max - min);
    }
}