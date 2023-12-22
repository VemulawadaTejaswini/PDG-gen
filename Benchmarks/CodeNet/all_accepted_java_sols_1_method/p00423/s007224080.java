import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int asum = 0;int bsum = 0;
			for(int i = 0;i < n;++i){
				int a = sc.nextInt();
				int b = sc.nextInt();
				if(a<b){
					bsum += (a+b);
				}
				else if(a>b){
					asum +=(a+b);
				}
				else{
					asum += a;
					bsum += b;
				}
			}
			System.out.println(asum+" "+bsum);
		}
	}
}