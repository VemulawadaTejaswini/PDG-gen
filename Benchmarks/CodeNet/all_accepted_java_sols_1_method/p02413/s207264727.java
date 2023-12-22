
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int r=cin.nextInt(),c=cin.nextInt();
		List<Integer> rsum=new ArrayList<>();
		for(int i=0;i<c;i++)rsum.add(0);
		
		for(int i=0;i<r;i++) {
			int sum=0;
			for(int j=0;j<c;j++) {
				int x=cin.nextInt();
				System.out.print(x+" ");
				sum+=x;
				rsum.set(j, rsum.get(j)+x);
			}
			System.out.println(sum);
		}
		
		int rcsum=0;
		for(int i=0;i<c;i++) {
			System.out.print(rsum.get(i)+" ");
			rcsum+=rsum.get(i);
		}
		System.out.println(rcsum);
	}
	
}
