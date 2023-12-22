import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int D = sc.nextInt();

		int[][] X = new int[N][D];

		for(int i=0;i<N;i++) {
			for(int j=0;j<D;j++) {
				X[i][j]= sc.nextInt();
			}
		}
		int ans = 0;
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				int[] a = X[i];
				int[] b = X[j];
				int d2  = d2(a,b,D);
				if(isSquareNumber(d2)) {
					ans ++;
				}
			}
		}
		System.out.println(ans);
	}
	public static int d2(int[] y, int[] z,int D) {
		int d2 = 0;

		int sum = 0;
		for(int i=0;i<D;i++) {
			sum += (y[i]-z[i])*(y[i]-z[i]);
		}
		d2 = sum;

		return d2;
	}
    // 平方数かどうかを調べる。
    public static boolean isSquareNumber (int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Argument must be 0 and over.");
        }
        double sqrtOfNumber = Math.sqrt(number);
        return (isInteger(sqrtOfNumber));
    }

    // 整数かどうかを調べる。
    public static boolean isInteger (double number) {
        return (number == Math.floor(number));
    }
}
