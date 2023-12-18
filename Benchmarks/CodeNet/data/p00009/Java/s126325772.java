import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int n=sc.nextInt();
			int cnt=0;
			if(Integer.toString(n).length()>6) break;
			for(int i=0;i<n;i++){
				if(isPrime(i)) cnt++;
			}
			System.out.println(cnt);
		}
		sc.close();
	}
	
	static boolean isPrime(int n){
		if(n<2) return false;
		for(int i=2;i*i<n;i++){
			if(n%i==0) return false;
		}
		return true;
	}
}