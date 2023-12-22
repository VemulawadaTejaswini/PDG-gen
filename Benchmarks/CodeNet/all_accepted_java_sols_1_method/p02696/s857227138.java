import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long a = sc.nextLong();
    static long b = sc.nextLong();
    static long n = sc.nextLong();
	static long n_max = 0;
	static long result = 0;
    static long _result = 0;
  
    public static void main(String[] args) {
		n_max = b > n ? n : b;      
        for (long i = n_max; i >= n_max - a; i--){
				_result = a * i / b - a * (i / b);
          		if (result < _result)
          			result = _result;
        }
        System.out.println(result);
    }
}