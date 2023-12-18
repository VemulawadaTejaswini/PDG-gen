import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		int n,i,j,a,min,ans;
		Scanner sc=new Scanner(System.in);
		n=Integer.parseInt(sc.next());
		int r[]=new int[n];
		for(i=0;i<n;i++){
			r[i]=Integer.parseInt(sc.next());
		}
		ans=r[1]-r[0];

		for(j=1;j<n-1;j++){
			for(i=0;i<j-1;i++){
				a=r[j]-r[i];
				ans=Math.max(a,ans);

			}
		}
		System.out.println(ans);


	}

}