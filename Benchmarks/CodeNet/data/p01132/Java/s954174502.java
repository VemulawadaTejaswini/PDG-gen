import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int count = 0;
			while(sc.hasNext()) {
				int m = sc.nextInt();
				if(m == 0) break;
				
				if(count > 0) System.out.println();
				count++;
				
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int d = sc.nextInt();
				
				int min = Integer.MAX_VALUE;
				int ansa = 0;
				int ansb = 0;
				int ansc = 0;
				int ansd = 0;
				
				for(int i=0; i<=a; i++) {
					for(int j=0; j<=b; j++) {
						for(int k=0; k<=c; k++) {
							for(int l=0; l<=d; l++) {
								int M = 10*i + 50*j + 100*k + 500*l - m;
								if(M < 0) continue;
								if(i == (M % 50 / 10) && i != 0) continue;
								if(j == (M % 100 / 50) && j != 0) continue;
								if(k == (M % 500 / 100) && k != 0) continue;
								if(l == (M / 500) && l != 0) continue;
								int z = a-i + b-j + c-k + d-l + M / 500+M%500 / 100+M%100 / 50+M%50 / 10;
								
								if(min > z) {
									min = z;
									ansa = i;
									ansb = j;
									ansc = k;
									ansd = l;
								}
							}
						}
					}
				}
				if(ansa != 0) System.out.println("10 " + ansa);
				if(ansb != 0) System.out.println("50 " + ansb);
				if(ansc != 0) System.out.println("100 " + ansc);
				if(ansd != 0) System.out.println("500 " + ansd);
			}
		}
	}
}
