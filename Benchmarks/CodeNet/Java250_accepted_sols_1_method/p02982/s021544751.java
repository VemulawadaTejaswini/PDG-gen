import java.util.*;
public class Main {
	public static void main(String args[] ){
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int d =sc.nextInt();
		int count =0;
		int ans = 0;
		int aaa =n*d;
		int data[] =new int[aaa];
		for(int i=0;i<n*d;i++) {
			data[i] =sc.nextInt();
		}
		
			for(int i=0;i<n*d;i+=d) {
				
				for(int j=i+d;j<n*d;j+=d) {
					if(i==j)continue;
					//System.out.println("i"+i+"j"+j);
				int ccount =0;
				int tt =0;
				while(ccount<d) {
					for(int t=0;t<d;t++) {
					 tt += Math.pow(data[i+t]-data[j+t],2);
					 //System.out.println(data[i+t]);
					 //System.out.println(data[j+t]);
					//System.out.println(t+"t");
							ccount++;
					}
					double ttt =Math.sqrt(tt);
				    int intint = (int)ttt;
					if((ttt-intint)==0.0) {
								ans++;
					  }
				}
		
			}
			
			
						
		
	  }
			System.out.println(ans);
	}
}
