import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int[] f = new int[b];
		for(int i=0;i<a;i++){
			int c = scan.nextInt();
			for(int l=0;l<c;l++){
				int d = scan.nextInt();
				f[d-1]++;
			}
		}
		int ans=0;
		Arrays.sort(f);
		for(int i=b-1;i>=0;i--){
			if(f[i]!=a){break;}else{ans++;}
		}
		System.out.println(ans);
	}
}