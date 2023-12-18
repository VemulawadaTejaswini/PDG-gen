import java.util.*;
import java.lang.*;
import java.io.*;
 
public class answer{
    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while(line!=null&&!"0".equals(line)){
            int cnt = Integer.parseInt(line);
            Dice dice = new Dice();
            for(int i=0;i<cnt;i++){
                line = br.readLine();
                dice.move(line);
            }
            System.out.println(dice.getAns());
            line = br.readLine();
        }
    }
     
    public static class Dice{
        int top,south,east,west,north,down;
        int topSum=1;
        Dice(){
            top=1;
            south=2;
            east=3;
            west=4;
            north=5;
            down=6;
        }
        public int getAns(){
            return topSum;
        }
        void move(String move){
            int tmp;
            if("North".equals(move)){
                tmp = top;
                top   = south;
                south = down;
                down  = north;
                north = tmp;
            }else if("East".equals(move)){
                tmp = top;
                top  = west;
                west = down;
                down = east;
                east = tmp;
            }else if("West".equals(move)){
                tmp = top;
                top  = east;
                east = down;
                down = west;
                west = tmp;
            }else if("South".equals(move)){
                tmp = top;
                top  = north;
                north = down;
                down = south;
                south = tmp;
            }else if("Right".equals(move)){
                tmp = south;
                south  = east;
                east = north;
                north = west;
                west = tmp;
            }else if("Left".equals(move)){
                tmp = south;
                south  = west;
                west = north;
                north = east;
                east = tmp;
            }
            topSum+=top;

        }
         
         
    }
}