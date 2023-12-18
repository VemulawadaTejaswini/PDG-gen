import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Integer> list=new ArrayList<>();
	static boolean[] prime=new boolean[10010];
	
	static void eratos() {
		for(int i=2; i<=10000; i++) {
			prime[i]=true;
		}
		for(int i=2; i<=10000; i++) {
			if(prime[i]) {
				list.add(i);
				for(int j=2; i*j<=10000; j++) {
					prime[i*j]=false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			eratos();
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				int sum=0;
				for(int i=0; i<n; i++) {
					sum+=list.get(i);
				}
				System.out.println(sum);
			}
			
			
		}
	}
}
