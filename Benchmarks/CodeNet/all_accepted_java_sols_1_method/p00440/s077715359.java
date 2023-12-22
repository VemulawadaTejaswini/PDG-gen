import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		for(;;){


			int n = sc.nextInt(),k=sc.nextInt();
			if(n+k==0)break;
			int[] a = new int[n+1];
			
			int[] b = new int[n+2];
			int[] c = new int[n+2];
			for(int i=0;i<k;i++){
				a[sc.nextInt()]=1;
			}
			int max=-1;
			for(int i=1;i<=n;i++){
				if(a[i]==1){
					b[i]=b[i-1]+1;
					max=Math.max(max, b[i]);
				}
			}
			for(int i=n;i>=1;i--){
				if(a[i]==1){
					c[i]=c[i+1]+1;
					max=Math.max(max, c[i]);
				}
			}
			if(a[0]==1){
				for(int i=1;i<=n;i++){
					if(a[i]==0){
						max=Math.max(max, b[i-1]+c[i+1]+1);
					}
				}
			}
			System.out.println(max);
		}
	}
}