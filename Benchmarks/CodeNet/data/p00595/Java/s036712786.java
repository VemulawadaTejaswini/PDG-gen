import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(n>m){
				int l = m;
				m=n;
				n=l;
			}
			int a = m;
			int b = n;			
			while(n!=0){
				int l = n;
				n = m%n;
				m = l;
			}
			System.out.println(m);
		}
	
	}	
}