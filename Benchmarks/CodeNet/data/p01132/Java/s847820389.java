import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				int d=sc.nextInt();
				int min=200000;
				int mina=0, minb=0, minc=0, mind=0;
				
				for(int ten=0; ten<=a; ten++) {
					for(int fif=0; fif<=b; fif++) {
						for(int hun=0; hun<=c; hun++) {
							for(int fiv=0; fiv<=d; fiv++) {
								int coin=ten*10+fif*50+hun*100+fiv*500;
								if(coin>=n) {
									int t=coin-n;
									int sum=a-ten+b-fif+c-hun+d-fiv;
									sum+=t/500;
									t%=500;
									sum+=t/100;
									t%=100;
									sum+=t/50;
									t%=50;
									sum+=t/10;
									if(min>sum) {
										mina=ten;
										minb=fif;
										minc=hun;
										mind=fiv;
										min=sum;
									}
								}
							}
						}
					}
				}
				if(mina>0)
				System.out.println("10 "+mina);
				if(minb>0)
				System.out.println("50 "+minb);
				if(minc>0)
				System.out.println("100 "+minc);
				if(mind>0)
				System.out.println("500 "+mind);
				System.out.println();
			}


		}
	}
}
