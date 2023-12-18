import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int cnt = 0;
			for(int a=0;a<182;a++){
				if(a*a>n) break;
				for(int b=a;b<182;b++){
					if(a*a+b*b>n) break;
					for(int c=b;c<182;c++){
						if(a*a+b*b+c*c>n) break;
						for(int d=c;d<182;d++){
							if(a*a+b*b+c*c+d*d==n) cnt++;
							else if(a*a+b*b+c*c+d*d>n) break;
						}
					}
				}
			}
			System.out.println(cnt);
		}	
	}	
}