import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(scan.hasNextInt()){
			int ans = 0;
			int n = scan.nextInt();
			int p[] = new int[100];

			for(int i=0;i<n;i++){
				p[i] = scan.nextInt();
			}
			Arrays.sort(p,0,n);

			for(int i=0,tmp=0;i<n;i++){
				tmp += p[i];
				ans += tmp;
			}
			System.out.println(ans);
		}
	}
}