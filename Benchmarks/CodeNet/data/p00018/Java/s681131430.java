import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		sc = new Scanner(System.in);
		new Main();
		sc.close();
	}
	
	Main()
	{
		
		int[] arr = new int[5];
		for(int i = 0; i < 5; ++i) arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		for(int i = 5; i > 0; --i)
			System.out.printf("%d%c", arr[i-1], i == 1 ? '\n' : ' ');
	}
	
	
	boolean isPrime(int n){
		if(n == 2) return true;
		if(n % 2 == 0) return false;
		
		for(int i = 3; i * i <= n; i += 2)
			if(n % i == 0) return false;
		
		return true;
	}

	static Scanner sc;
}