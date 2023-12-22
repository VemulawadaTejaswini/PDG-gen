import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int ans[] = new int[1001];
		for(int i=1;i<1000;i++){
			for(int j=i+1; j<1001;j++){
				int sum = (j-i+1)*(i+j)/2;
				if(sum<=1000) ans[sum]++;
			}
		}
		while(true){
			int n = in.nextInt();
			if(n==0) return ;
			System.out.println(ans[n]);
		}
	}
}