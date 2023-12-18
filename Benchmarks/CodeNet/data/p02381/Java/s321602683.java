import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int i,n,sum;
		int rec[];
		double a;
		
		while(true){
			n = sc.nextInt();
			if(n==0){
				break;
			}
			rec = new int[n];
			sum = 0;
			a = 0;
			
			for(i=0;i<n;i++){
				rec[i] = sc.nextInt();
				sum += rec[i];
			}
			sum /= n;
			for(i=0;i<n;i++){
				a += Math.pow((double)(rec[i]-sum), 2);
			}
			a /= n;
			a = Math.sqrt(a);
			
			System.out.println(a);
		}
		
		sc.close();
		

	}

}

