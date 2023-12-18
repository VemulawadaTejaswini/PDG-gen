import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 1;
		int ans = -200000;
		int sum = 0;
		int a=0;
		int b=0;
		while((n=Integer.parseInt(br.readLine()))!=0){
			for(int i = 0 ; i < n ; i ++){
				a=Integer.parseInt(br.readLine());
				if(a>0){
					sum+=a;
				}else if(sum>ans){
					ans=sum;
				}
				else
					sum=0;
			}
			System.out.println((sum>ans)?sum:ans);
			sum=0;
			ans=-200000;
		}
	}
}