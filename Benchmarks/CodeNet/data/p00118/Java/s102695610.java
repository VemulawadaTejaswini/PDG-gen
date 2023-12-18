import java.io.*;
import java.util.*;
import java.awt.Point;
public class Main{
		// up down left right
        static int[][] next = {
        	{-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };

        public static void main(String[] args) throws IOException, StackOverflowError{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> Ansers = new ArrayList<Integer>();
        String line;


        while((line = in.readLine()) != null){
        	//first line
            String[] areaInformation = line.split(" ");
            int height = Integer.parseInt(areaInformation[0]);
            int width  = Integer.parseInt(areaInformation[1]);
            //separater
            if(height == 0 && width == 0){
                break;
            }

            //after second line
            byte[][] areaName       = new byte[height+2][width+2];
            boolean[][] someoneOwns = new boolean[height+2][width+2];
            //for each line i.e. current row
            for(int currentHeight = 1; currentHeight < height+1; ++currentHeight){
            	//get row data
                line = in.readLine();
                //outer zone
                areaName[currentHeight][0]     = 0;
                areaName[currentHeight][width] = 0;
                someoneOwns[currentHeight][0]     = true;
                someoneOwns[currentHeight][width] = true;
                for(int currentWidth = 1; currentWidth < width+1; ++currentWidth){
                	//get column data
                    String c = line.substring(currentWidth-1, currentWidth);
                    //outer zone
	                areaName[0][currentWidth]      = 0;
	                areaName[height][currentWidth] = 0;
    	            someoneOwns[0][currentWidth]      = true;
    	            someoneOwns[height][currentWidth] = true;
	                //main area
                    if(c.equals("@")){
                        areaName[currentHeight][currentWidth] = 1;
                    }
                    else if(c.equals("#")){
                        areaName[currentHeight][currentWidth] = 2;
                    }
                    else if(c.equals("*")){
                        areaName[currentHeight][currentWidth] = 3;
                    }
                    someoneOwns[currentHeight][currentWidth] = false;
                }
            }

            int count = 0;
            for(int currentHeight = 1; currentHeight < height+1; ++currentHeight){
                for(int currentWidth = 1; currentWidth < width+1; ++currentWidth){
                    if(!someoneOwns[currentHeight][currentWidth]){
                        count++;
                        createOwnersArea(areaName, someoneOwns, currentHeight, currentWidth);
                    }
                }
            }

            Ansers.add(count);
        }

        for(Integer anser : Ansers){
            System.out.println(anser);
        }
    }
    public static void createOwnersArea(byte[][] areaName, boolean[][] someoneOwns, int currentHeight, int currentWidth){
    	Stack<Point> dfsArea = new Stack<Point>();
    	dfsArea.push(new Point(currentHeight, currentWidth));
    	someoneOwns[currentHeight][currentWidth] = true;
    	while(!dfsArea.empty()){
    		Point currentPosition = dfsArea.pop();
    		//for each derction check the area
    		for(int i = 0; i < 4; ++i){
    			int nextX = currentPosition.x + next[i][0];
    			int nextY = currentPosition.y + next[i][1];
    			if(!someoneOwns[nextX][nextY]
    				&& areaName[currentPosition.x][currentPosition.y] == areaName[nextX][nextY]){
    				someoneOwns[nextX][nextY] = true;
	    			dfsArea.push(new Point(nextX, nextY));
    			}
    		}
    	}
    }
}