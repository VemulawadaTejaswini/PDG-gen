import java.util.*;
import java.io.*;
public class Main{
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      int h = Integer.parseInt(st.nextToken());
      int w = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken())-1;
      int b = Integer.parseInt(st.nextToken())-1;
      int c = Integer.parseInt(st.nextToken())-1;
      int d = Integer.parseInt(st.nextToken())-1;
      String[] map = new String[h];
      int[][] len = new int[h][w];
      for(int i = 0; i < h; i++) {
    	  map[i] = br.readLine();
      	  for(int j = 0; j < w; j++)
      		  len[i][j] = -1;
      }
      Queue<Integer> curr = new LinkedList<Integer>();
      curr.add(c*w+d);
      len[c][d] = 0;
      while(curr.size() > 0) {
    	  int temp = curr.remove();
    	  int x = temp/w;
    	  int y = temp%w;
    	  int val = len[x][y];
    	  x--;
    	  while(x >= Math.max(temp/w - k,0) && map[x].charAt(y) == '.') {
    		  if(len[x][y] == -1) {
    			  len[x][y] = val + 1;
    			  curr.add(x*w+y);
    		  }
    		  x--;
    	  }
    	  x = temp/w + 1;
    	  while(x < Math.min(temp/w+k+1,h) && map[x].charAt(y) == '.') {
    		  if(len[x][y] == -1) {
    			  len[x][y] = val + 1;
    			  curr.add(x*w+y);
    		  }
    		  x++;
    	  }
    	  x = temp/w;
    	  y--;
    	  while(y >= Math.max(temp%w - k,0) && map[x].charAt(y) == '.') {
    		  if(len[x][y] == -1) {
    			  len[x][y] = val + 1;
    			  curr.add(x*w+y);
    		  }
    		  y--;
    	  }
    	  y = temp%w + 1;
    	  while(y < Math.min(temp%w+k+1,w) && map[x].charAt(y) == '.') {
    		  if(len[x][y] == -1) {
    			  len[x][y] = val + 1;
    			  curr.add(x*w+y);
    		  }
    		  y++;
    	  }
      }
      out.println(len[a][b]);
      out.close();
   }
}