import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ans=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int hako[]=new int[n];
		/*for(int i=1;i<=n;i++) {
			hako[i]=sc.nextInt();
		}*/
		for(int i=1;i<=n;i++) {
			s:for(int x=1;x<=i;x++) {
				for(int y=1;y<=i;y++) {
					for(int z=1;z<=i;z++) {
						if((x*x)+(y*y)+(z*z)+(x*y)+(y*z)+(z*x)==i && x==y && y==z && z==x) {
							System.out.println(1);
							break s;
						}
						else if((x*x)+(y*y)+(z*z)+(x*y)+(y*z)+(z*x)==i) {
							System.out.println(3);
							break s;
						}
						else if((x*x)+(y*y)+(z*z)+(x*y)+(y*z)+(z*x)>i && y==i) {
							System.out.println(0);
							break s;
						}
					}
				}
			}
		}
		
		
	}
}
