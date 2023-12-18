import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	int[] r = new int[n];
	for (int i = 0; i < n; i++) {
	    r[i] = Integer.parseInt(scan.nextLine());
	}
	int max = r[1] - r[0];
	int min = r[0];
	for (int i = 1; i < n; i++) {
	    if (max < r[i] - min){
		max = r[i] - min;
	    }
	    if (min > r[i]){
		min = r[i];
	    }
	}
	System.out.println(max);
    }
}