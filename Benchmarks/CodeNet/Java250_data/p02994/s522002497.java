import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();	
		int a=sc.nextInt();	
		
		 int l=a;
		 int r=a+n-1;
		 int eat=0;
		 
		 if(r<=0) {
			 eat=r;
		 }else if(l>=0) {
			 eat=l;
		 }else {
			eat=0;
		 }
		int answer=(r+l)*(r-l+1)/2-eat;
		System.out.println(answer);
		sc.close();
	}

}