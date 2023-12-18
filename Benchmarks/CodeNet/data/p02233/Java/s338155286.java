import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Fibonacci fibonacci = new Fibonacci(Integer.parseInt(in.readLine()));
		fibonacci.numberCulc();
	}
}

class Fibonacci {
	public int[] fibonacci;
	public int result;

	public Fibonacci(int fibonacci) {
		this.fibonacci = new int[fibonacci + 1];
	}

	public int fibFunc(int num) {
		if (num == 0 || num == 1) {
			return 1;
		} else {
			return fibFunc(num - 1) + fibFunc(num - 2);
		}
	}

	public void numberCulc() {
		for (int i = 0; i < fibonacci.length; i++) {
			fibonacci[i] = fibFunc(i);
		}
		result = fibonacci[fibonacci.length - 1];
		System.out.println(result);
	}
}