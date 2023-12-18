import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int w, p;
		int[] ans = new int[51];
		Arrays.fill(ans, Integer.MAX_VALUE);
		for(int a=0;a<=4;a++){
			for(int b=0;b<=3;b++){
				for(int c=0;c<=2;c++){
					for(int d=0;d<=5;d++){
						for(int e=0;e<=4;e++){
							for(int f=0;f<=3;f++){
								w = a*2 + b*3 + c*5 + d*10 + e*12 + f*15;
								if(w<=50){
									p = a*380 + b*550 + c*850 + d*1520 + e*1870 + f*2244;
									ans[w] = Math.min(ans[w], p);
								}
							}
						}
					}
				}
			}
		}
		
		for(int i=0;i<50;i++){
			if(ans[i]>ans[i+1]) ans[i] = ans[i+1];
		}

		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			System.out.println(ans[n/100]);
		}	
	}	
}