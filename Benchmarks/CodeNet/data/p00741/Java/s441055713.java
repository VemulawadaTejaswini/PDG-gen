import java.util.Scanner;

public class Main{
	static int H, W;
	static int[][] field=new int[51][51];
	static void dfs(int w, int h) {
		if(w>=0 && w<W && h>=0 && h<H) {
		
		if(field[h][w]==1) {
			field[h][w]=2;
			dfs(w+1, h);
			dfs(w-1, h);
			dfs(w, h+1);
			dfs(w, h-1);
			dfs(w+1, h+1);
			dfs(w+1, h-1);
			dfs(w-1, h+1);
			dfs(w-1, h-1);
		}
		}
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        W = sc.nextInt();
        H = sc.nextInt();
        if(W==0 && H==0) {
        	break;
        }
        int num=0;
        for(int i=0; i<H; i++) {
        	for(int j=0; j<W; j++) {
        		field[i][j]=sc.nextInt();
        	}
        }
        for(int i=0; i<H; i++) {
        	for(int j=0; j<W; j++) {
        		if(field[i][j]==1) {
        			dfs(j, i);
        			num++;
        		}
        	}
        }
        System.out.println(num);
        }
	}
}
