import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0)break;
			
			String[] a = new String[n];
			int[] b = new int[n];
			
			for(int i=0;i<n;i++){
				a[i] = sc.next();
				b[i] = sc.nextInt();
			}
			
			int sum = 0;
			int c = 0;
			String s = "";
			
			for(int i=0;i<m;i++){
				s = sc.next();
				for(int j=0;j<n;j++){
					c = 0;
					while(a[j].codePointAt(c)==42)c++;
					if(a[j].substring(c,8).compareTo(s.substring(c,8))==0)sum+=b[j];
				}
			}
			System.out.println(sum);
			
		}
	
	}	
}