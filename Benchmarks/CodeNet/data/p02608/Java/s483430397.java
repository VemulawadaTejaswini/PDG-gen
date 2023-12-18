import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int ans = 0;
		for(int i=1;i<6;++i){
			System.out.println(0);
		}
		int xyz = 0;
		boolean bflag = false;
		for(int i=6;i<=N;++i){
			bflag = false;
			ans = 0;
			for(int x=1;x*x<N;++x){
				for (int y = 1; y * y < N; ++y) {
					for (int z = 1; z * z < N; ++z) {
						xyz = (x+y+z)*(x+y+z)-(x*y+y*z+z*x);
						if(xyz == i){
							if(x==y && x==z){
								ans = 1;
							}else if(x==y || y==z || z==x){
								ans=3;
							}else{
								ans=6;
							}
							//System.out.println("    ["+i+"]"+x+","+y+","+z);
							bflag = true;
						}
						if(bflag) break;
					}
					if (bflag)
						break;
				}
				if (bflag)
					break;
			}
			//System.out.println("["+i+"]"+ans);
			System.out.println(ans);
		}
	}
}
