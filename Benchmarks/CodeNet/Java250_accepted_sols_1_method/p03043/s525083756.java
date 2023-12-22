import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int genzai = 0;
		double result = 1d/(double)n;
		//System.out.println(result);
		double ans = 0;
		ArrayList<Double> arr=new ArrayList<>();
		if(k==1) {
			ans=1;
		}else {
			for(int i=1;i<=n;i++) {
				genzai = i;
				while(true) {
					if(genzai>k-1) {
						arr.add(result);
						result = 1d/(double)n;;
						break;
					}
					genzai=genzai*2;
					result=result*0.5d;
				}
			}
			for(double d:arr) {
				ans+=d;
			}
		}
		System.out.println(ans);
	}
}