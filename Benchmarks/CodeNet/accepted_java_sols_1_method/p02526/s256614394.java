import java.util.Scanner;
import java.io.File;


class Main{
	public static void main(String[] args){
		int ans=0;
		Scanner text = new Scanner(System.in);
		int n = text.nextInt();
		int s[] = new int[n];
		for(int i=0;i<n;i++){
			s[i]=text.nextInt();
		}

		int q = text.nextInt();
		int t[] = new int[q];
		
		for(int i=0;i<q;i++){
			t[i]= text.nextInt();	
		}

		for(int i=0;i<q;i++){
			for(int j=0;j<n;j++){
				if(s[j]==t[i]){
					ans++;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}