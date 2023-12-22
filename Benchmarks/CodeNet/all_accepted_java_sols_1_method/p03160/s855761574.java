import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for (int i=0;i<n;++i) a[i]=in.nextInt();
		int fromPrevious = Math.abs(a[1] - a[0]);
        int fromBeforePrevious = 0;
		for (int i=2;i<n;++i) {
          int temp = fromPrevious;
          fromPrevious = Math.min(fromPrevious + Math.abs(a[i] - a[i-1]), 
                                  fromBeforePrevious + Math.abs(a[i]-a[i-2]));
          fromBeforePrevious = temp;
		}
		System.out.println(fromPrevious);
	}
}