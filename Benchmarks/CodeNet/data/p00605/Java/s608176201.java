import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] blood;
		int n=0,k=0;
		boolean ok = true;
		
		while(sc.hasNext()){
			n = sc.nextInt();
			k = sc.nextInt();
			if(n==0 && k==0) break;
			
			blood = new int[k];
			for(int i = 0;i<k;i++) blood[i] = sc.nextInt();
			
			for(int i = 0;i<n;i++){
				for(int j = 0;j<blood.length;j++){
					blood[j] -= sc.nextInt();
					if(blood[j]<0) ok = false;
				}
			}
			
			System.out.println(ok ? "Yes" : "No");
			ok = true;
		}
	}
}