import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String ssc = sc.nextLine();
		String[] assc = ssc.split(" ");
		int ih = Integer.parseInt(assc[0]);
		int iw = Integer.parseInt(assc[1]);
		int[][] igmb = new int[ih][iw];
		ssc = "";
		for(int x=0;x<ih;x++){
			ssc = sc.nextLine();
			for(int y=0;y<iw;y++){
				if(ssc.charAt(y)=='#'){
					igmb[x][y] = -1;
					if(x!=0&&y!=0)igmb[x-1][y-1] = (igmb[x-1][y-1])!=-1 ? (igmb[x-1][y-1])+1 : -1;
					if(y!=0)igmb[x][y-1] = (igmb[x][y-1])!=-1 ? (igmb[x][y-1])+1 : -1;
					if(x!=ih-1&&y!=0)igmb[x+1][y-1] = (igmb[x+1][y-1])!=-1 ? (igmb[x+1][y-1])+1 : -1;
					if(x!=0)igmb[x-1][y] = (igmb[x-1][y])!=-1 ? (igmb[x-1][y])+1 : -1;
					if(x!=ih-1)igmb[x+1][y] = (igmb[x+1][y])!=-1 ? (igmb[x+1][y])+1 : -1;
					if(x!=0&&y!=iw-1)igmb[x-1][y+1] = (igmb[x-1][y+1])!=-1 ? (igmb[x-1][y+1])+1 : -1;
					if(y!=iw-1)igmb[x][y+1] = (igmb[x][y+1])!=-1 ? (igmb[x][y+1])+1 : -1;
					if(x!=ih-1&&y!=iw-1)igmb[x+1][y+1] = (igmb[x+1][y+1])!=-1 ? (igmb[x+1][y+1])+1 : -1;
				}
			}
		}
		for(int x=0;x<ih;x++){
			for(int y=0;y<iw;y++){
				if(igmb[x][y]!=-1){
					System.out.print(igmb[x][y]);
				}
				else{
					System.out.print('#');
				}
			}
			System.out.println("");
		}
    }
}
