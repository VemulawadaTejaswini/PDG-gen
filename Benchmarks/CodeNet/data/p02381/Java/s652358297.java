
import java.util.*;

public class Main {
	 
	static String str;
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		while(true) {
			int n=cin.nextInt(),m=0;double alph=0;
			List<Integer> data=new ArrayList<>();
			
			if(n==0)break;
			
			for(int i=0;i<n;i++) {
				int s=cin.nextInt();
				data.add(s);
				m+=s;
			}
			
			m/=n;
			
			for(int i=0;i<n;i++) {
				alph+=Math.pow(data.get(i)-m, 2);
			}
			
			System.out.println(Math.sqrt(alph/n));
		}
		
	}
	
	
	
}
