import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			char[] c = sc.next().toCharArray();
			
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt()-1;
				b[i] = sc.nextInt()-1;
			}
			
			char temp;
			for(int i=n-1;i>=0;i--){
				c[a[i]]+=(b[i]-a[i]);
				c[b[i]]+=(b[i]-a[i]);
				while((int)c[a[i]]>122) c[a[i]]-=26;
				while((int)c[b[i]]>122) c[b[i]]-=26;
				temp = c[a[i]];
				c[a[i]] = c[b[i]];
				c[b[i]] = temp;
			}
			for(int j=0;j<c.length;j++) System.out.print(c[j]);
			System.out.println();				
		}
	}
}