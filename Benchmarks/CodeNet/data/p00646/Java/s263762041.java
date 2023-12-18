import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while (sc.hasNext()) {
				long L = sc.nextLong();
				if (L == 0) break;
				long ans = 1;
				for(int i=2; i*i<=L; i++) {
					if(L%i!=0) continue;
					L/=i;
					int count=1;
					while(L%i==0) {
						L/=i;
						count++;
					}
					ans*=count*2+1;
					//ans*=(count+1)*(count+1)-count*count;
				}
				if(L!=1) {
					ans*=3;//2*2-1*1
				}
				System.out.println((ans+1)/2);
			}
			
		}
	}
}
