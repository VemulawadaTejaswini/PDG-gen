import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t=1;
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			boolean[][][] c = new boolean[7][7][7];
			for(int z=1;z<=5;z++){
				for(int i=1;i<=5;i++){
					char[] aa = sc.next().toCharArray();
					for(int j=1;j<=5;j++){
						if(aa[j-1]=='1') c[z][i][j] = true;
					}
				}
			}
			
			int an = sc.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int i=0;i<an;i++) a.add(sc.nextInt());
			int bn = sc.nextInt();
			ArrayList<Integer> b = new ArrayList<Integer>();
			for(int i=0;i<bn;i++) b.add(sc.nextInt());
			
			int cnt;
			for(int nn=0;nn<n;nn++){
				boolean[][][] temp = new boolean[7][7][7];
				for(int z=1;z<=5;z++){
					for(int i=1;i<=5;i++){
						for(int j=1;j<=5;j++){
							cnt = 0;
							for(int p=-1;p<=1;p++){
								for(int q=-1;q<=1;q++){
									for(int r=-1;r<=1;r++){
										if(p==0 && q==0 && r==0) continue;
										if(c[z+p][i+q][j+r]==true) cnt++;
									}
								}
							}
							if(c[z][i][j]==false && a.contains(cnt)==true){
								temp[z][i][j] = true;
							}else if(c[z][i][j]==true && b.contains(cnt)==false){
								temp[z][i][j] = false;
							}else{
								temp[z][i][j] = c[z][i][j];
							}
						}
					}
				}
				for(int z=1;z<=5;z++){
					for(int i=1;i<=5;i++){
						for(int j=1;j<=5;j++){
							c[z][i][j] = temp[z][i][j];
						}
					}
				}
			}
			
			if(t!=1) System.out.println();
			System.out.println("Case " + t + ":");
			for(int z=1;z<=5;z++){
				for(int i=1;i<=5;i++){
					for(int j=1;j<=5;j++){
						if(c[z][i][j]==true) System.out.print(1);
						else System.out.print(0);
					}
					System.out.println();
				}
				if(z!=5) System.out.println();
			}
			t++;
		}
	}

}