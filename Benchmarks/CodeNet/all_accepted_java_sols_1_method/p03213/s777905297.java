import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] p={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97},d=new int[25];
		for(int i=2;i<=n;++i){
			int I=i;
			for(int j=0;j<25;++j){
				while(I%p[j]==0){
					I/=p[j];
					++d[j];
				}
			}
		}

		int r=0;
		for(int i=0;i<25;++i){
			if(d[i]>=74)
				++r;
			for(int j=0;j<25;++j){
				if(i==j)
					continue;
				if(d[i]>=2&&d[j]>=24)
					++r;
				if(d[i]>=4&&d[j]>=14)
					++r;
				for(int k=j+1;k<25;++k){
					if(i!=k&&d[i]>=2&&d[j]>=4&&d[k]>=4)
						++r;
				}
			}
		}
		System.out.println(r);
	}
}
