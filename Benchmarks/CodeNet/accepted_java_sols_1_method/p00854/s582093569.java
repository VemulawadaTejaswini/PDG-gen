import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && k==0 && m==0) break;
			
			m--;
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=1;i<=n;i++) list.add(i);
			for(int i=n-1;i>0;i--){	
				list.remove(m);
				m+=(k-1);
				while(m>=i) m-=i;
			}
			System.out.println(list.get(0));
		}	
	}	
}