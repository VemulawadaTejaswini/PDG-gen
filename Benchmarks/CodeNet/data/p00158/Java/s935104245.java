import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			long count = 0;
			while(true){
				if(n%2==0) n/=2;
				else n=n*3+1;
				count++;
				if(n==1) break;
			}
			System.out.println(count);
		}
	}	
}