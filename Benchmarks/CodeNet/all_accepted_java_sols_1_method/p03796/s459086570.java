import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		Long kaijo = 1L;
		long p = 1000000007;
		for(int i=2; i<=n; i++){
			kaijo *= i;
          	kaijo = kaijo % p;
		}
		System.out.println(kaijo);
	}
}