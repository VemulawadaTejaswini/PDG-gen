import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int h=s.nextInt(),w=s.nextInt(),k=s.nextInt();
		char[][] f=new char[h][w];
		int[][] r=new int[h][w];

		for(int i=0;i<h;++i)
			s.next().getChars(0,w,f[i],0);

		{
			int c=1;
			for(int i=0;i<h;++i){
				int begin=w;
				boolean exist=false;
				for(int j=0;j<w;++j){
					if(f[i][j]=='#'){
						exist=true;
						begin=Math.min(begin,j);
						r[i][j]=c++;
					}else if(j>0){
						r[i][j]=r[i][j-1];
					}
				}
				if(exist){
					for(int j=begin-1;j>=0;--j){
						r[i][j]=r[i][j+1];
					}
				}
			}

			for(int j=0;j<w;++j){
				for(int i=1;i<h;++i){
					if(r[i][j]==0)
						r[i][j]=r[i-1][j];
				}
				for(int i=h-2;i>=0;--i){
					if(r[i][j]==0)
						r[i][j]=r[i+1][j];
				}
			}
		}

		for(int[]o:r) {
			StringJoiner sj=new StringJoiner(" ");
			for(int i:o)
				sj.add(""+i);
			System.err.println(sj);
			System.out.println(sj);
		}
	}
}
