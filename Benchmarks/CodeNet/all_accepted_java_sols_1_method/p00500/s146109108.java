import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] ans = new int[n];
		
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();			
			c[i] = sc.nextInt();			
		}
		
		boolean x;
		for(int i=0;i<n;i++){
			x = true;
			for(int j=0;j<n;j++){
				if(i!=j){
					if(a[j]==a[i])x=false;
				}
			}
			if(x==true)ans[i]+=a[i];
		}
		for(int i=0;i<n;i++){
			x = true;
			for(int j=0;j<n;j++){
				if(i!=j){
					if(b[j]==b[i])x=false;
				}
			}
			if(x==true)ans[i]+=b[i];
		}
		for(int i=0;i<n;i++){
			x = true;
			for(int j=0;j<n;j++){
				if(i!=j){
					if(c[j]==c[i])x=false;
				}
			}
			if(x==true)ans[i]+=c[i];
		}
		for(int i=0;i<n;i++){
			System.out.println(ans[i]);
		}
	
	}
}