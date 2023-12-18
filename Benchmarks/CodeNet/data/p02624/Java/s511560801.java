import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long a = 0;
		for(int i=1;i<=n;i++) {
			a += i*divCount(i);
			System.out.println(i+"\t\t"+divCount(i));
		}
		System.out.println(a);
	}
	static int divCount(int n) 
	{ 
		ArrayList<Integer> factors = new ArrayList<Integer>();
    int incrementer = n % 2 == 0 ? 1 : 2;

    for (int i = 1; i <= Math.sqrt(n); i += incrementer) {
        if (n % i == 0) {
            factors.add(i);
            if (i != n / i) {
                factors.add(n/i);
            }

        }
    }

    return factors.size();

	} 
	  

}
