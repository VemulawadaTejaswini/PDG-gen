import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		new Main();
	}
	
	Main()
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int cnt = 0;
			for(int i = 2; i <= n; ++i)
				cnt += isPrime(i) ? 1 : 0;
			System.out.println(cnt);
		}
		sc.close();
	}
	
	
	boolean isPrime(int n){
		if(n == 2) return true;
		if(n % 2 == 0) return false;
		
		for(int i = 3; i * i <= n; i += 2)
			if(n % i == 0) return false;
		
		return true;
	}

}