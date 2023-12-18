import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int d = sc.nextInt();
			if(a==0 && b==0 && d==0) break;
			
			int t;
			boolean flag = false;
			if(a<b){
				t = a;
				a = b;
				b = t;
				flag = true;
			}
			
			int ansx = Integer.MAX_VALUE;
			int ansy = Integer.MAX_VALUE;
			int sum = Integer.MAX_VALUE;
			for(int i=d/a;i>=0;i--){
				if((d-i*a)%b==0){
					ansx = i;
					ansy = (d-i*a)/b;
					sum = ansx+ansy;
					break;
				} 
			}
			
			for(int i=0;;i++){
				for(int j=0;;j++){
					t = i*a-j*b;
					if(Math.abs(t)==d && i+j<sum){
						ansx = i;
						ansy = j;
						sum = ansx+ansy;
					}
					if(t<-d) break;
				}
				if(sum<i) break;
			}
			
			if(flag==false) System.out.println(ansx + " " + ansy);
			else System.out.println(ansy + " " + ansx);
		}	
	}	
}