import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m)==0)break;
			int[] a = new int[n];
			int[] b = new int[m];
			int sumA = 0;
			int sumB = 0;
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
				sumA += a[i];
			}
			for(int i=0;i<m;i++){
				b[i] = sc.nextInt();
				sumB += b[i];
			}
			if((sumA+sumB)%2==1){
				System.out.println("-1");
			}else{
				Arrays.sort(a);
				Arrays.sort(b);
				int sub = (sumA+sumB)/2 - sumA;
				boolean go = true;
				for(int i=0;i<n;i++){
					for(int j=0;j<m;j++){
						if(b[j]-a[i]==sub){
							System.out.println(a[i] + " " + b[j]);
							i=n;
							j=m;
							go = false;
						}
					}
				}
				if(go==true)System.out.println("-1");

			}	
		}
	}
}