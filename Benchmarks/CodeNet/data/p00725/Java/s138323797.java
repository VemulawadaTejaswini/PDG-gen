
import java.util.Scanner;
 
public class Main 
{
    static int w;
    static int h;
    static int[][] map;
    static Scanner scan = new Scanner(System.in);
    static int inst = 0;
	static long limit = 131072*8/10;
	
	static int curmin = 999;
     
    static void printout(int[][] curmap, int xpos, int ypos)
    {


    	
    	
        for(int y = 0; y < h; y++)
        {
            for(int x = 0; x < w; x++)
            {
                if(xpos == x && ypos == y)
                {
                    System.out.print("X ");
                }
                else
                {
                    System.out.print(curmap[x][y] + " ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("");
    }
    
    static void garb()
    {
    	long used = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024;
    	if(used >= limit)
    	{
    		System.gc();
    	}    	
    }
     
    static int roll(int[][] copymap, int curmoves, int xpos, int ypos, int rollx, int rolly)
    {
    	
    	//early quit (max) -> dont continue if it gets longer than our current minimum.
    	inst += 1;
//    	System.out.println("INST " + inst);
//        System.gc();
    	
        int[][] curmap = new int[w][h];
         
         
        for(int x = 0; x < w; x++)
        {
            curmap[x] = copymap[x].clone();
        }
         
//      System.out.println("XD " + rollx + " YD " + rolly);
//      printout(curmap, xpos, ypos);       
         
         
        if(curmoves > 10 || curmoves > curmin) {return 999;}
        if(rollx != 0 || rolly != 0)
        {
            while(true)
            {
                if(xpos+rollx < 0 || xpos+rollx >= w || ypos+rolly < 0 || ypos+rolly >= h)
                {
                    //out of bounds
//                  System.out.println("OOB");
                    return 999;
                }   
                 
                if(curmap[xpos+rollx][ypos+rolly] == 3)
                {
//                  System.out.println("Goal in " + curmoves);
                    curmin = Math.min(curmin, curmoves);
                    return curmoves;
                }
                if(curmap[xpos+rollx][ypos+rolly] == 1)
                {
                    curmap[xpos+rollx][ypos+rolly] = 0;
//                  System.out.println("Hit wall");
                    break;
                }
                xpos += rollx;
                ypos += rolly;
                 
                if(xpos < 0 || xpos >= w || ypos < 0 || ypos >= h)
                {
                    //out of bounds
                    return 999;
                }               
            }
//          System.out.println("XD " + rollx + " YD " + rolly);
//          printout(curmap, xpos, ypos);
        }
         
//      int[][] newmap = new int[w][h];
//      for(int i = 0; i < w; i++)
        {
//          newmap[i] = map[i].clone();
        }
         
        int ans = 999;
        //roll
        {
            if(ypos > 0 && curmap[xpos][ypos-1] != 1)ans = Math.min(ans, roll(curmap, curmoves+1, xpos, ypos, 0, -1));
            if(ypos < h-1 && curmap[xpos][ypos+1] != 1)ans = Math.min(ans, roll(curmap, curmoves+1, xpos, ypos, 0, 1));
            if(xpos < w-1 && curmap[xpos+1][ypos] != 1)ans = Math.min(ans, roll(curmap, curmoves+1, xpos, ypos, 1, 0));
            if(xpos > 0 && curmap[xpos-1][ypos] != 1)ans = Math.min(ans, roll(curmap, curmoves+1, xpos, ypos, -1, 0));
        }
         
         
        curmin = Math.min(curmin, ans);
        return ans;
    }
 
    public static void main(String[] args) 
    {
        while(true)
        {
            w = scan.nextInt();
            h = scan.nextInt();
             
            if(w == 0)break;
             
            int xpos = -1;
            int ypos = -1;
             
            map = new int[w][h];
             
            for(int y = 0; y < h; y++)
            {
                for(int x = 0; x < w; x++)
                {
                    map[x][y] = scan.nextInt();
                     
                    if(map[x][y] == 2)
                    {
                        map[x][y] = 0;
                        xpos = x;
                        ypos = y;
                    }
                }
            }
             
            curmin = 999;
            int ans = roll(map, 0, xpos, ypos, 0, 0);
            if(ans == 999) {ans = -1;}
            System.out.println(ans);
            
            garb();
        }
    }
 
}
