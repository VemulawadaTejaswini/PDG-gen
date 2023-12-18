import java.io.*;
import java.util.*;

class Field{
	final char SEA ='0';
	final char LAND='1';
	
	StringBuilder map;
	int width;
	int height;
	
	Field(int w,int h, String[][] buf){
		width = w;
		height= h;
		map= new StringBuilder();
		StringBuilder edge= new StringBuilder();
		for(int i=0;i<w+2;i++){
			edge.append(SEA);
		}
		map.append(edge);
		for(int i=0;i<h;i++){
			map.append(SEA);
			for(int j=0;j<w;j++){
				map.append(buf[i][j]);
			}
			map.append(SEA);
		}
		map.append(edge);
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
		int[] neib= {point2int(x-1,y-1),point2int(x,y-1),point2int(x+1,y-1),
				     point2int(x-1,y  ),                 point2int(x+1,y  ),
				     point2int(x-1,y+1),point2int(x,y+1),point2int(x+1,y+1)};
		return neib;
	}
	int[] neighbor(int n){
		int x= int2x(n); int y= int2y(n);
		int[] neib= {point2int(x-1,y-1),point2int(x,y-1),point2int(x+1,y-1),
			         point2int(x-1,y  ),                 point2int(x+1,y  ),
			         point2int(x-1,y+1),point2int(x,y+1),point2int(x+1,y+1)};
		return neib;
	}

	char charAt(int x, int y){
		return map.charAt(point2int(x,y));
	}
	char charAt(int n){
		int x= int2x(n); int y= int2y(n);
		return map.charAt(point2int(x,y));
	}
	
	void traverse(){
		Deque<Integer> dfs= new LinkedList<Integer>();
		int tmp;
		int cnt=0;
		while ( ( tmp=map.indexOf(String.valueOf(LAND)) ) >=0 ) {
			cnt++;
			dfs.push(tmp);
			map.setCharAt(tmp, SEA);
			while (!dfs.isEmpty()) {
				tmp = dfs.peek();
				boolean reached = true;
				for(int i=0; i<neighbor(tmp).length; i++) {
					int next = neighbor(tmp)[i];
					if ( charAt(next) == LAND ) {
						dfs.push(next);
						map.setCharAt(next, SEA);
						reached = false;
					}
				}
				if (reached) {
					dfs.pop();
				}
			} 
		}
		System.out.println(cnt);
	}
}

public class Main{
    public static void main(String args[]) throws Exception{
    	Scanner sc= new Scanner(System.in);
    	int width,height;
    	while(true){
    		width = sc.nextInt();
    		height= sc.nextInt();
    		if( width!=0 || height!=0 ){
    			String[][] buf_map= new String[height][width];
    			for(int i=0;i<height;i++){
    				for(int j=0;j<width;j++){
    					buf_map[i][j]= sc.next();
    				}
    			}
    			Field f= new Field(width,height,buf_map); 
    			f.traverse();
    		} else{ break; }
    	}
    }
}