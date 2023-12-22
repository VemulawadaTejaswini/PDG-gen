import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] a = new int[N];
	for(int i = 0; i < N;i++){
	    a[i] = sc.nextInt() - (i + 1);
	}

	Arrays.sort(a);

	int median = a[N / 2];

	long sum = 0;
	for(int i = 0; i < N; i++){
	    sum += Math.abs(a[i] - median);
	}
	System.out.println(sum);
    }
}
