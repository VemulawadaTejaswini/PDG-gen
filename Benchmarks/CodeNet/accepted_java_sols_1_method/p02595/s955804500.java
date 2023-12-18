import java.util.*;

public class  Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int d = sc.nextInt();
	long[] x = new long[n * 2];
	for(int i = 0; i < n * 2; i++) {
		x[i] = sc.nextInt();
    }
    int count = 0;
    for(int j = 0; j < n * 2; j += 2) {
        if(d >= Math.sqrt((x[j] * x[j]) + (x[j + 1] * x[j + 1]))){
        count++;
        }
    }
    System.out.println(count);
	sc.close();
	}
}