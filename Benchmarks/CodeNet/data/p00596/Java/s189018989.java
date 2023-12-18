import java.io.*;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));       
        try {
        	String line;
        	while((line=r.readLine())!=null){
                /* input from here */
        		int n = Integer.parseInt(line);
        		String[] in = r.readLine().split(" ");
        		boolean[][] b = new boolean[7][7];
        		boolean res = false;
        		for(int i=0;i<7;i++){
        			Arrays.fill(b[i], false);
        		}
        		for(String s : in){
        			b[Integer.parseInt(s.substring(0,1))][Integer.parseInt(s.substring(1))] = true;
        		}
        		int count = in.length;
                /* input till here */
                /* processing from here */
        		for(int i=0;i<7;i++){
        			for(int j=i;j<7;j++){
        				if(b[i][j]){
        	        		if(res = solve(b,i,j,count)){
        	        			break;
        	        		}
        				}
        			}
        			if(res){
        				break;
        			}
        		}
                /* processing till here */
                /* output */
        		if(res){
        			System.out.println("Yes");
        		} else {
        			System.out.println("No");
        		}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static boolean solve(boolean[][] b, int sr,int sc, int count){
    	if(count==1){
    		return true;
    	} else {
    		 boolean[][] temp = b;
    		 if(sc<6&&b[sr][sc+1]){
    			 temp[sr][sc] = false;
    			 return solve(temp,sr,sc+1,count-1);
    		 }
    		 if(sr<6&&b[sr+1][sc]){
    			 temp[sr][sc] = false;
    			 return solve(temp,sr+1,sc,count-1);
    		 }
    		 if(sc>0&&b[sr][sc-1]){
    			 temp[sr][sc] = false;
    			 return solve(temp,sr,sc-1,count-1);
    		 }
    		 if(sr>0&&b[sr-1][sc]){
    			 temp[sr][sc] = false;
    			 return solve(temp,sr-1,sc,count-1);
    		 }
    		 return false;
    	}
    }
}