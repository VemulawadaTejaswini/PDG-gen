import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[][] map=new int[14][14];	//2~11*2~11
		String str;
		String[] input;
		int x,y,size,max=0,cnt=0;
		try{
			while((str=br.readLine())!=null&&!str.isEmpty()){
				input=str.split(",");
				x=Integer.parseInt(input[0])+2;
				y=Integer.parseInt(input[1])+2;
				size=Integer.parseInt(input[2]);
				map[x-1][y]++;
				map[x][y-1]++;
				map[x][y]++;
				map[x][y+1]++;
				map[x+1][y]++;
				if(size>=2){
					map[x-1][y-1]++;
					map[x-1][y+1]++;
					map[x+1][y-1]++;
					map[x+1][y+1]++;
					if(size==3){
						map[x-2][y]++;
						map[x][y-2]++;
						map[x][y+2]++;
						map[x+2][y]++;
					}
				}
			}
			for(int i=2;i<=11;i++){	//2~11
				for(int j=2;j<=11;j++){	//2~11
					if(map[i][j]==0) cnt++;
					else if(map[i][j]>max) max=map[i][j];
				}
			}
			System.out.println(cnt+"\n"+max);
		}catch(Exception e){
		}
	}
}