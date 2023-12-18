import java.io.*;
import java.util.*;

class Field{
	StringBuilder map;
	int width;
	int height;
	
	Field(int w,int h, String[] buf) throws IOException{
		width = w;
		height= h;
		map= new StringBuilder();
		StringBuilder edge= new StringBuilder();
		for(int i=0;i<w+2;i++){
			edge.append("#");
		}
		map.append(edge);
		for(int i=0;i<h;i++){
			map.append("#");
			map.append(buf[i]);
			map.append("#");
		}
		map.append(edge);
		
		System.out.println(map.length());
	}
	
	int point2int(int x, int y){
		return (width+2)*y + x;
	}
	int int2x(int n){
		return n%(width+2);
	}
	int int2y(int n){
		return n/(width+2);
	}
	
	int[] neighbor(int x, int y){
		int[] neib= {point2int(x,y-1),point2int(x-1,y),point2int(x+1,y),point2int(x,y+1)};
		return neib;
	}
	int[] neighbor(int n){
		int x= int2x(n); int y= int2y(n);
		int[] neib= {point2int(x,y-1),point2int(x-1,y),point2int(x+1,y),point2int(x,y+1)};
		return neib;
	}

	char charAt(int x, int y){
		return map.charAt(point2int(x,y));
	}
	char charAt(int n){
		int x= int2x(n); int y= int2y(n);
		return map.charAt(point2int(x,y));
	}
	
	int countRange(){
		int cnt=0;
		for(int i=0;i<map.length();i++){
			if( map.charAt(i)=='@' ){ cnt++; }
		}
		return cnt;
	}
	
	void traverse(){
		Deque<Integer> dfs= new LinkedList<Integer>();
		dfs.push(map.indexOf("@"));
		while( !dfs.isEmpty() ){
			int tmp  = dfs.peek();
			boolean reached= true;
			for(int i=0;i<4;i++){
				int next= neighbor(tmp)[i];
				if( charAt(next)=='.' ){
					map.setCharAt(next, '@');
					dfs.push(next);
					reached= false;
				}
			}
			if(reached){ dfs.pop(); }
		}
		
		System.out.println(map);
		System.out.println(countRange());
	}
}

public class Main{
    public static void main(String args[]) throws Exception{
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	int width,height;
    	while(true){
    		String[] buf= br.readLine().split(" ");
    		width = Integer.parseInt(buf[0]);
    		height= Integer.parseInt(buf[1]);
    		if( width!=0 || height!=0 ){
    			String[] buf_map= new String[height];
    			for(int i=0;i<height;i++){
    				buf_map[i]= br.readLine();
    			}
    			Field f= new Field(width,height,buf_map); 
    			f.traverse();
    		} else{ break; }
    	}
    }
}