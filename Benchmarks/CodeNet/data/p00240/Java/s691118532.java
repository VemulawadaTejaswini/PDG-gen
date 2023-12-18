import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int y = sc.nextInt();
			double max = 0;
			int ans = 0;
			
			int b, t;
			double r, temp;
			for(int i=0;i<n;i++){
				b = sc.nextInt();
				r = sc.nextDouble();
				t = sc.nextInt();
				if(t==1){
					temp = 1+(double)y*r*0.01;
				}else{
					temp = Math.pow((1+r*0.01), y);
				}
				if(temp>max){
					max = temp;
					ans = b;
				}
			}
			System.out.println(ans);
		}
	}	
}