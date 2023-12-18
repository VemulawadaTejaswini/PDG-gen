import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			StringBuffer sb = new StringBuffer("I");
			for(int i=0;i<n;i++) sb.append("OI");
			int m = sc.nextInt();
			String s = sc.next();
			int count = 0;
			int len = 1+2*n;
			for(int i=0;i<=m-len;i++){
				if(s.substring(i,i+len).compareTo(sb.toString())==0) count++;
			}
			System.out.println(count);
		}
	}	
}