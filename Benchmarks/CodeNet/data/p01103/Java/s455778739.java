import java.util.*;

class Main{
	public static void main(String[] A){
		Scanner s=new Scanner(System.in);
		
		int[][]f=new int[10][10];
		while(true){
			int h=s.nextInt(),w=s.nextInt();
			if(h+w==0)
				return;
			for(int i=0;i<h;++i)
				for(int j=0;j<w;++j)
					f[i][j]=s.nextInt();
			
			int r=0;
			
			for(int i=0;i<h-2;++i) {
				for(int j=0;j<w-2;++j) {
					for(int k=i+2;k<h;++k) {
						loop:
						for(int l=j+2;l<w;++l) {
							
							int edge=9;
							for(int I=i;I<=k;++I)
								edge=Math.min(edge,Math.min(f[I][j],f[I][l]));
							for(int J=j;J<=l;++J)
								edge=Math.min(edge,Math.min(f[i][J],f[k][J]));
							
							int res=0;
							for(int I=i+1;I<k;++I) {
								for(int J=j+1;J<l;++J) {
									if(f[I][J]>=edge)
										continue loop;
									res+=edge-f[I][J];
								}
							}
							r=Math.max(r,res);
						}
					}
				}
			}
			System.out.println(r);
		}
	}
}

