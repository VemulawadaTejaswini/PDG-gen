import java.util.Scanner;
 
public class Main {
	static int[][] land(int[][] f,int h,int w,int hh,int ww){
		f[h][w]=0;
		for(int i=-1;i<2;i++) {
			for(int j=-1;j<2;j++) {
				if(i==-1 && h==0)continue;
				if(j==-1 && w==0)continue;
				if(i==1 && h==hh-1)continue;
				if(j==1 && w==ww-1)continue;
				
				if(f[h+i][w+j]==1) {
					land(f,h+i,w+j,hh,ww);
				}
			}
		}
		
		return f;
	}
	
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	while(sc.hasNext()) {
        		int w = sc.nextInt();
        		int h = sc.nextInt();
        		if(w+h==0)break;
        		int[][] f = new int[h+1][w+1];
        		for(int i=0;i<h;i++) {
        			for(int j=0;j<w;j++) {
        				f[i][j] = sc.nextInt();
        			}
        		}
        		
        		int cnt = 0;
        		for(int i=0;i<h;i++) {
        			for(int j=0;j<w;j++) {
        				if(f[i][j]==1) {
        					cnt++;
        					land(f,i,j,h,w);	//land関数で１つの島につき１一つに纏める
        					f[i][j]=1;
        				}
        			}
        		}
        		
        		System.out.println(cnt);
        	}
        }
    }
}



