
import java.util.Scanner;

public class Main{ 
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int val = sc.nextInt();
				if(val==0)break;
				int a = sc.nextInt();int b= sc.nextInt();
				int c = sc.nextInt(); int d = sc.nextInt();
				
				int min = 9999999;
				int ansa = 0;int ansb = 0;
				int ansc = 0;int ansd =0;
				for(int i=0;i<=a;i++) {
					for(int j=0;j<=b;j++) {
						for(int k=0;k<=c;k++) {
							for(int l=0;l<=d;l++) {
								int mon = 10*i+50*j+100*k+500*l-val;
								if(mon<0)continue;
								if(i==(mon%50/10) && i!=0)continue;
								if(j==(mon%100/50) && j!=0)continue;
								if(k==(mon%500/100) && k!=0)continue;
								if(l==(mon/500) && l!=0)continue;
								
								if(min>a-i+b-j+c-k+d-l+mon/500+mon%500/100+mon%100/50+mon%50/10) {
									min = a-i+b-j+c-k+d-l+mon/500+mon%500/100+mon%100/50+mon%50/10;
									ansa = i;
									ansb = j;
									ansc = k;
									ansd = l;
								}
							}
						}
					}
				}
				if(ansa!=0)
				System.out.println("10 "+ansa);
				if(ansb!=0)
				System.out.println("50 "+ansb);
				if(ansc!=0)
				System.out.println("100 "+ansc);
				if(ansd!=0)
				System.out.println("500 "+ansd);
			}
		}
	}
}

