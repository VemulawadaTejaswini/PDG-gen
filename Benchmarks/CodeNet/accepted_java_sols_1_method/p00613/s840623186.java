import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			int k = in.nextInt();
			if(k==0)break;
			int n = k*(k-1)/2;
			//System.out.println(n);
			int sum=0;
			//int data[] = new int[101];
			for(int i=0;i<n;i++){
				sum+=in.nextInt();
			}
			int ans=sum/(k-1);
			System.out.println(ans);
		}
	}
}