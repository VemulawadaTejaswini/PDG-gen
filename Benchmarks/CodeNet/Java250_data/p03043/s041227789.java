import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		double ans=0;
		for(int i=1;i<=n;i++){
			int score=i;
			double bunbo=n;
			double ans2=1/bunbo;
			int count=0;
			while(true){
				if(score<k){
					score*=2;
					count++;
					ans2*=0.5;
				}else
					break;
			}
			ans+=ans2;
		}
		System.out.println(ans);
	}
}