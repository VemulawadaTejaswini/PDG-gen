
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			int count=0;
			int T=in.nextInt();
			int[] a=new int[T];
			for(int i=0;i<T;i++) {
				a[i]=in.nextInt();
			}
			for(int i=0;i<T;i=i+2) {
				if(a[i]%2==1) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
