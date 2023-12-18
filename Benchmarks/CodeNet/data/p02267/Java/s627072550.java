
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		int n,q,i,j,key,ans=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int s[]=new int[n];
		for(i=0;i<n;i++){
			s[i]=sc.nextInt();
		}
		q=sc.nextInt();
		int t[]=new int[q];
		for(j=0;j<q;j++){
			t[j]=sc.nextInt();
		}

		for(j=0;j<q;j++){
			key=t[j];
			for(i=0;i<n;i++){
				if(s[i]==key){
					ans++;
					break;
				}

			}
		}
		System.out.println(ans);

	}

}