import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()){
	    int n = Integer.parseInt(scan.nextLine());
	    if (n == 0) {
		break;
	    }
	    String[] input = scan.nextLine().split(" ");
	    int[] s = new int[n];
	    int count = 0;
	    for (int i = 0; i < n; i++) {
		s[i] = Integer.parseInt(input[i]);
		count += s[i];
	    }
	    double m = (double)count / n;
	    double sigma = 0;
	    for (int i = 0; i < n; i++) {
		sigma += (s[i] - m) * (s[i] - m);
	    }
	    double a = Math.sqrt(sigma / n);
	    System.out.println(a);
	}	
    }
}