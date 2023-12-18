import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ans=0,task=0;
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] l=new int[51];
		for(int i=0;i<n;i++) {
			l[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(l[i]>l[j]) {
					task=l[i];
					l[i]=l[j];
					l[j]=task;
				}
			}
		}
		for(int i=0;i<k;i++) {
			ans+=l[i];
		}
		System.out.println(ans);

	}

}