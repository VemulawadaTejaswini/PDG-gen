import java.util.Scanner;
import java.util.Arrays;

class Main {

    public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	int v[] = new int[N];
	for (int i = 0; i < N; i++)
	    v[i] = sc.nextInt();

	Arrays.sort(v);
	double ave = ((double)(v[1] - v[0])) / 2 + v[0];
	for (int i = 2; i <= N - 1; i++)
	    ave = ((double)(ave - v[i])) / 2 + v[i];

	System.out.println(ave);
    }
}