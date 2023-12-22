import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();	
		int b=sc.nextInt();	
		int c=sc.nextInt();	
		
		int total=a+b+c;
		int min=Math.min(Math.min(a,b),Math.min(b,c));
		int max=Math.max(Math.max(a,b),Math.max(b,c));
		int ans=total-min-max;
		
		int count=0;
		count=max-ans;
		min+=count;
		count+=(max-min)/2;
		if((max-min)%2==1){
			count+=2;
		}
		System.out.println(count);
		sc.close();
	}
}