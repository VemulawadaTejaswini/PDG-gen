import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] v=new int[n];
		for(int i=0; i<n; i++){
			v[i]=sc.nextInt();
		}
		int[] zero=new int[100001];
		int[] one=new int[100001];
		for(int i=0; i<n; i++){
			if(i%2==0){
				zero[v[i]]++;
			}else{
				one[v[i]]++;
			}
		}
		int zerom=0;
		int z=0;
		int onem=0;
		int o=0;
		for(int i=0; i<100001; i++){
			if(zerom<zero[i]){
				z=i;
				zerom=zero[i];
			}
			if(onem<one[i]){
				o=i;
				onem=one[i];
			}
		}
		if(z==o){
			int z2=0;
			int o2=0;
			for(int i=0; i<100001; i++){
				if(i!=z && z2<zero[i]){
					z2=zero[i];
				}
				if(i!=o && o2<one[i]){
					o2=one[i];
				}
			}
			int k=Math.max(z2,o2);
			System.out.println(n-zerom-k);
		}else{
			System.out.println(n-zerom-onem);
		}
	}
}
