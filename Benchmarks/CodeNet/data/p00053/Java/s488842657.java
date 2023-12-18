import java.util.*;
public class Main {
	
	static boolean judgePrime(int i){
		for(int j=2; j<i; j++)
			if(i%j==0) return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int sum=0; int cnt=0;
			for(int i=2; ; i++){
				if(judgePrime(i)){sum+=i; cnt++;}
				if(cnt==n) break;
			}
			System.out.println(sum);
		}

	}

}