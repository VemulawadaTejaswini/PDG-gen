import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int max1=0;// the largest
		int max2=0;// second largest 
		int a;
		int index=0;
		for (int i=0;i<n;++i) {
			a=Integer.parseInt(scan.next());
			if (a>max1) {
				max2=max1;
				max1=a;
				index=i;
			}else {
				max2=Math.max(max2, a);
			}			
		}
		
		for (int i=0;i<n;++i) {
			if (i==index) {
				System.out.println(max2);
			}else {
				System.out.println(max1);
			}
		}
		
}
}
//end