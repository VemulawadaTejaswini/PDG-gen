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

		if(x+1<H){
			if(map[x+1][y].equals(temp)&&!map[x+1][y].equals("_")){
				int[] neoPoint = {x+1, y};
				search(neoPoint);
			}
		}
		if(y+1<W){
			if(map[x][y+1].equals(temp)&&!map[x][y+1].equals("_")){
				int[] neoPoint = {x, y+1};
				search(neoPoint);
			}
		}
		if(x-1>=0){
			if(map[x-1][y].equals(temp)&&!map[x-1][y].equals("_")){
				int[] neoPoint = {x-1, y};
				search(neoPoint);
			}
		}
		if(y-1>=0){
			if(map[x][y-1].equals(temp)&&!map[x][y-1].equals("_")){
				int[] neoPoint = {x, y-1};
				search(neoPoint);
			}
		}
    }

    private void setLine(int tempH, String input){
        for(int i = 0; i < map[tempH].length; i++){
            String entity = input.substring(i,i+1);
            map[tempH][i] = entity;
        }
    }
}

    