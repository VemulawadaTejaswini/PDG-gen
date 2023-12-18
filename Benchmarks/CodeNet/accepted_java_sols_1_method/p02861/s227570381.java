import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    int n;
    
    Scanner sc = new Scanner(System.in);
	n = sc.nextInt();

	int x[] = new int[n];
	int y[] = new int[n];
	
	for (int i = 0; i < n; i++) {
		x[i] = sc.nextInt();
		y[i] = sc.nextInt();
	}

	double sum = 0;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			sum += Math.sqrt((x[i] - x[j])*(x[i] - x[j]) + (y[i] - y[j])*(y[i] - y[j]));
		}
	}
	
	double ave = sum / (n * (n - 1));
	
	System.out.println( ave * (n - 1));

    return;
  }
}

    
    
    
