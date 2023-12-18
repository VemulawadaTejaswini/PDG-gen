import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=Integer.parseInt(sc.next());

		int k=Integer.parseInt(sc.next());
		int t,cnt=0;
		double y,ans=0;

		for(int i=1;i<=n;i++){
			t=1;
			cnt=0;
			y=1.0;
			while((i*t)<k){
				t=t*2;
				y=(double)(y/2);
				cnt+=1;
			}
			ans+=(double)(y/n);
		}
		System.out.println(ans);
	}

}