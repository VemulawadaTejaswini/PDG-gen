import java.util.*;

public class Main {
	public static int w = 1, h = 1,possible=0;
	
	public static void main(String[] args) {
		while (true) {
			possible=0;
			Scanner scan = new Scanner(System.in);
			w = scan.nextInt();
			h = scan.nextInt();
			if(w==0&&h==0){
				break;
			}
			String space = scan.nextLine();	
			String data[] = new String[h];
			for (int i=0;i<h;++i) {
				data[i]=scan.nextLine();
			}
			int[][] d = new int[h][w];
			String[] redata = new String[w];
			for (int i=0;i<h;++i) {
				redata=data[i].split("");
				for (int j=0;j<w;++j) {
					if(redata[j].equals(".")){
						d[i][j]=1;
					}
					if(redata[j].equals("#")){
						d[i][j]=2;
					}
					if(redata[j].equals("@")){
						d[i][j]=0;
					}
				}
			}
			for (int i=0;i<h;++i) {
				for (int j=0;j<w;++j) {
					if(d[i][j]==0){
						possible++;
						cheak(d,i,j);
					}
				}
			}
			System.out.println(possible);
		}
	}
	public static void cheak(int[][] data, int i, int j) {
		if(i-1>=0){
			if(data[i-1][j]==1){
				possible++;
				data[i-1][j]=0;
				cheak(data,i-1,j);
			}
		}
		if(j-1>=0){
			if(data[i][j-1]==1){
				possible++;
				data[i][j-1]=0;
				cheak(data,i,j-1);
			}
		}
		if(j+1<w){
			if(data[i][j+1]==1){
				possible++;
				data[i][j+1]=0;
				cheak(data,i,j+1);
			}
		}
		if(i+1<h){
			if(data[i+1][j]==1){
				possible++;
				data[i+1][j]=0;
				cheak(data,i+1,j);
			}
		}
	}
}

