import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean card[]=new boolean[11];
		int c1,c2,c3,i,j,sum;
		double p;
		while(sc.hasNext()){
			double count=0;
			Arrays.fill(card, true);
			c1=sc.nextInt();
			c2=sc.nextInt();
			c3=sc.nextInt();
			card[c1]=false;
			card[c2]=false;
			card[c3]=false;
			sum=c1+c2;
			j=20-sum;
			for(i=1;i<11;i++){
				if(card[i] && i<=j){
					count++;
				}
			}
			p=count/7;
			if(p>=0.5){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}//while
	}
}