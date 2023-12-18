import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		boolean t=true;
		while(t){
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			int c3=sc.nextInt();
			int sum=c1+c2;
			int cnt=0;
			for(int i=1;i<=10;i++){
				if(c1==i||c2==i||c3==i)continue;	
				if(sum+i<=20)cnt++;
			}
			//System.out.println(cnt/7*100);
			if(cnt*100/7>=50){
				System.out.println("YES");
			}else {
				System.out.println("NO");
				break;
			}
		}
	}
}