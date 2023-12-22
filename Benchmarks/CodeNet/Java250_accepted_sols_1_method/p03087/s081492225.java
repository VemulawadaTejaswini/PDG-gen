import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int q=Integer.parseInt(scan.next());
		String s=scan.next();
		int[] count=new int [n];
		Arrays.fill(count, 0);
		//累積和
		for (int i=1;i<n;++i) {
			if (s.charAt(i-1)=='A'&&s.charAt(i)=='C') {
					count[i]=count[i-1]+1;			
				}
			else {
				count[i]=count[i-1];
			}
		}
		
		int l,r;
		int[] ans =new int [q];
		for (int i=0;i<q;++i) {
			l=Integer.parseInt(scan.next());
			r=Integer.parseInt(scan.next());
			ans[i]=count[r-1]-count[l-1];
			
		}
		
		for (int i=0;i<q;++i) {
			System.out.println(ans[i]);
		}
		
	
}
}
//end
