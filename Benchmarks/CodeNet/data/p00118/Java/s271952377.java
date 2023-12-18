import java.io.*;
public class Main{
    public static void main(String args[]){
		Main a = new Main();
		a.run();
    }

    String[][] map;
    int H = -1;
	int W = -1;

    public void run(){
        try{
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            String line = "";
            int tempH = 0;
			
            while(!(line = stdReader.readLine()).equals("0 0")){
                if(W==-1){
                    H = Integer.valueOf(line.split(" ")[0]);
                    W = Integer.valueOf(line.split(" ")[1]);
                    map = new String[H][W];
                }else if(!line.equals("0 0")){
                    setLine(tempH, line);
                    tempH += 1;
                }				
				if(tempH == H){
					solve();
					W = -1;
					H = -1;
					tempH = 0;
				}
            }
            stdReader.close();
        }catch(Exception e){
			e.getStackTrace();
        }
    }

    private void solve(){
        int person = 0;
        int[] point;
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				if(!map[i][j].equals("_")){
					int[] in = {i,j};
					search(in);
					person++;
				}
			}
		}
        System.out.println(person);
    }
    
    private void search(int[] point){
        int x = point[0];
        int y = point[1];
        String temp = map[x][y];
		map[x][y] = "_";

		int[] dx = {-1,0,1,0};
		int[] dy = {0,-1,0,1};
		
		for(int i = 0; i < 4; i++){
			if(isOnMap(x+dx[i],y+dy[i])){
				if(map[x+dx[i]][y+dy[i]].equals(temp)&&!map[x+dx[i]][y+dy[i]].equals("_")){
					int[] neoPoint = {x+dx[i], y+dy[i]};
					search(neoPoint);
				}
			}			
		}
    }
	
	private boolean isOnMap(int x, int y){
		return (0<=x && x<H && 0 <= y && y < W);
	}
	
    private void setLine(int tempH, String input){
        for(int i = 0; i < map[tempH].length; i++){
            String entity = input.substring(i,i+1);
            map[tempH][i] = entity;
        }
    }
}

    