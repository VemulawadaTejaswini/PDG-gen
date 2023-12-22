import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n =Integer.parseInt(scan.next());
		int[] h=new int [n];
		int max=0;
		for (int i=0;i<n;++i) {
			h[i]=Integer.parseInt(scan.next());
			max=Math.max(max, h[i]);
		}
		
		int count=0;
		boolean last=false;
		while (max>0) {
			--max;
			count++;
			last=false;
			for (int i=0;i<n;++i) {
				if (h[i]>0) {	
					last=true;
					--h[i];
				}else if (i+1<n&&h[i+1]>0&&last) {
					++count;
				}
			}
			
			
		}
		
		System.out.print(count);

	}
}
//end
