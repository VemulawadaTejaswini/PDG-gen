import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,n,i,ans,year,money,k,hand,sum,r,temp;
		double p;

		m=sc.nextInt();
		while(m--!=0){
			ans=0;
			money=sc.nextInt();
			temp=money;
			year=sc.nextInt();

			n=sc.nextInt();
			while(n--!=0){
				sum=0;
				k=sc.nextInt();
				p=sc.nextDouble();
				hand=sc.nextInt();
				if(k==0){
					for(i=0;i<year;i++){
						sum+=(int)money*p;
						money-=hand;
					}
					sum+=money;
				}
				else{
					sum=temp;
					for(i=0;i<year;i++){
						r=(int) (sum*p);
						sum+=r;
						sum-=hand;
					}
				}
				ans=(int) Math.max(ans, sum);
			}
			System.out.println(ans);
		}//w
	}

}