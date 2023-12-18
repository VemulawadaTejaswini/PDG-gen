import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		double[] array = new double[N];
    		for (int i=0; i<array.length; i++) {
    			array[i] = 1.0/sc.nextDouble();
    		}

    		double sum = 0.0;
    		for (int i=0; i<array.length; i++) {
    			sum += array[i];
    		}
    		System.out.println(1.0/sum);

    	} finally {
    		sc.close();
    	}
    }
}

