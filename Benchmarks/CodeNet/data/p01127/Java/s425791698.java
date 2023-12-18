import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj2002().doIt();
    }
    class aoj2002{
    	char map[][] = new char[51][51];
    	Size size[] = new Size[128];
    	ArrayList<Character> array = new ArrayList<Character>();
    	void set(int H,int W){
    		for(int i = 0;i < H;i++){
    			String str = sc.next();
    			char ctr[] = str.toCharArray();
    			for(int j = 0;j < W;j++){
    				map[i][j] = ctr[j];
//    				System.out.print(map[i][j]+" ");
    				if(map[i][j] != '.'){
    					Size s = size[map[i][j]];
    					size[map[i][j]] = new Size(Math.min(s.minx,j),Math.max(s.maxx,j+1),Math.min(s.miny,i),Math.max(s.maxy,i+1));
    				}
    			}
//    			System.out.println();
    		}
    		
    	}
    	void clear(){
    		for(char c = 'A';c <= 'Z';c++){
    			size[c] = new Size(100,0,100,0);
    		}
    		array.clear();
    	}
    	boolean alf(char c){
    		for(int i = size[c].miny;i < size[c].maxy;i++){
				for(int j = size[c].minx;j < size[c].maxx;j++){
					if(map[i][j] == '.')return false;
				}
			}
    		return true;
    	}
    	boolean alf_check(char c){
    		for(int i = size[c].miny;i < size[c].maxy;i++){
				for(int j = size[c].minx;j < size[c].maxx;j++){
					if(map[i][j] != c){
						if(map[i][j] != '1')return false;
					}
				}
			}
    		return true;
    	}
    	void same(char c){
    		for(int i = size[c].miny;i < size[c].maxy;i++){
				for(int j = size[c].minx;j < size[c].maxx;j++){
					map[i][j] = '1';
				}
			}
    	}
    	String check(){
    		for(char c = 'A';c <= 'Z';c++){
    			if(size[c].maxx - size[c].minx < 0 || size[c].maxy - size[c].miny < 0)continue;
    			if(!alf(c))return "SUSPICIOUS";
    			array.add(c);
//    			System.out.println(c+" "+size[c].minx+" "+size[c].maxx+" "+size[c].miny+" "+size[c].maxy);
    		}
//    		System.out.println(array.toString());
    		int cnt = array.size();
    		while(cnt > 0){
//    			System.out.println(array.toString());
    			for(int i = 0;i < array.size();i++){
    				if(alf_check(array.get(i))){
    					same(array.get(i));
    					array.remove(i);
    					break;
    				}
    			}
    			if(cnt == array.size())return "SUSPICIOUS";
    			cnt = array.size();
    		}
//    		for(int i = 0;i < array.size();i++){
//    			System.out.print(array.get(i)+" ");
//    		}
//    		System.out.println();
    		return "SAFE";
    	}
        void doIt(){
        	int n = sc.nextInt();
        	for(int i = 0;i < n;i++){
        		int h = sc.nextInt();
        		int w = sc.nextInt();
        		clear();
        		set(h,w);
        		System.out.println(check());
        	}
        }
        class Size{
            int minx,maxx,miny,maxy;
            public Size(int minx,int maxx,int miny,int maxy) {
                this.minx = minx;
                this.maxx = maxx;
                this.miny = miny;
                this.maxy = maxy;
            }
        }
     }
}