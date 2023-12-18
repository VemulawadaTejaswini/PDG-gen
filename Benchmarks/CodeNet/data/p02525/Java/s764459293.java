import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	while (scan.hasNext()) {
	    int n = scan.nextInt(); // 生徒の人数

	    if (0==n)
		break;

	    int[] s = new int[n]; // 成績

	    int sum = 0;
	    for (int i=0; i<n; i++) {
		s[i] = scan.nextInt();
		sum += s[i];
	    }

	    double m = (double)sum / n; // 平均

	    double sum2 = 0.0;
	    for (int i=0; i<n; i++)
		sum2 += Math.pow(s[i] - m, 2);

	    double var = Math.sqrt(sum2/n);
	    System.out.println(var);
	}
    }
}