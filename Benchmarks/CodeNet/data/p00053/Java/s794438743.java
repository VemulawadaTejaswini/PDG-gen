import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean index[]=new boolean[1000000];
		Arrays.fill(index, true);
		index[0]=false;
		index[1]=false;
		for(int i=0;i<index.length;i++){
			if(index[i]){
				for(int j=i+i;j<index.length;j+=i){
					index[j]=false;
				}
			}
		}
		
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			int cnt=0,ans=0,num=2;
			while(n!=cnt){
				if(index[num]){
					ans+=num;
					cnt++;
				}
				num++;
			}
			System.out.println(ans);
		}
	}
}