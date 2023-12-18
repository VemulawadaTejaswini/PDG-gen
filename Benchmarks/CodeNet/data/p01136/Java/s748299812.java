import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();//人数
				if(n==0) break;
				boolean[][] sche=new boolean[n+1][31];
				for(int i=1; i<=n; i++) {
					int f=sc.nextInt();
					for(int j=0; j<f; j++) {
						int d=sc.nextInt();
						sche[i][d]=true;
					}
				}
				int[] map=new int[n+1];
				for(int i=1; i<=n; i++) {
					map[i]=1;
				}
				int ans=0;
				for(int day=1; day<=30; day++) {
					for(int i=1; i<=n; i++) {
						for(int j=i+1; j<=n; j++) {
							if(sche[i][day] && sche[j][day]) {
								int a=map[i];
								int b=map[j];
								map[i]=a+b;
								map[j]=a+b;
								if(map[i]==n || map[j]==n) {
									ans=day;
									break;
								}
							}
						}
						if(ans!=0) {
							break;
						}
					
					}
					if(ans!=0) {
						break;
					}
				}
				System.out.println(ans);
				
			}


		}
	}
}
