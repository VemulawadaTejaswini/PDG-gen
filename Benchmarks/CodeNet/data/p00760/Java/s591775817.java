
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int[] Nor = {20,19,20,19,20,19,20,19,20,19};
			int SumN = 195;
			int[] Spe = {20,20,20,20,20,20,20,20,20,20};
			int SumS = 200;
			int mine = 196471;
			
			while(sc.hasNext()) {
				int n = sc.nextInt();
				for(int j=1;j<=n;j++) {
					int day = 0;
					int y = sc.nextInt();
					int m = sc.nextInt();
					int d = sc.nextInt();
					for(int i=1;i<=y;i++) {
						if(i%3==0) {
							if(i == y) {
								if(m==1)
									day += d;
								else
									for(int k=m-1;k>=0;k--) {
										if(k == m-1)
											day += d;
										else
											day += Spe[k];
											
									}
							}
							else
								day += SumS;
						}
						else {
							if(i==y) {
								if(m==1)
									day += d;
								else
									for(int k=m-1;k>=0;k--) {
										if(k == m-1)
											day += d;
										else
											day += Nor[k];
									}
							}
							else
								day += SumN;
						}
					}
					System.out.println(mine-day);
				}
			}
		}
	}
}

