import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	public class Main {
		public static void main(String[] args) {
		String line;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int [][]map=new int[10][10];
		int count=0,max=0;
		try {
				while((line=reader.readLine())!=null) {
					if(line.equals(""))break;
					String []st=line.split(",");
					int x=Integer.parseInt(st[0]);
					int y=Integer.parseInt(st[1]);
					int size=Integer.parseInt(st[2]);
					map[x][y]++;
	                if(x!=0)map[x-1][y]++;if(x!=9)map[x+1][y]++;
	                if(y!=0)map[x][y-1]++;if(y!=9)map[x][y+1]++;
	                if(size>1){
	                    if(x!=0&&y!=0)map[x-1][y-1]++;if(x!=9&&y!=0)map[x+1][y-1]++;
	                    if(x!=9&&y!=9)map[x+1][y+1]++;if(x!=0&&y!=9)map[x-1][y+1]++;
	                }
	                if(size==3){
	                    if(x>=2)map[x-2][y]++;if(x<=7)map[x+2][y]++;
	                    if(y>=2)map[x][y-2]++;if(y<=7)map[x][y+2]++;
	                }
				}
			for(int i=0;i<10;i++){
					for(int j=0;j<10;j++){
						if (map[i][j]==0)
							count++;
						else{
							if(map[i][j]>max){
								max=map[i][j];
							}
						}
					}	
				}
				System.out.println(count);
				System.out.println(max);  
			} catch (IOException e) {
				e.printStackTrace();
			}				  			
		}
	}
