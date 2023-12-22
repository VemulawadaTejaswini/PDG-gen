import java.io.*;  

public class Main {
    public static void main(String[] args) throws IOException {
	int hour;                                         
	int min;                                          
	int sec;                                          
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String buf = br.readLine();
    String[] str = buf.split(" ",0);
    
    // w???width
    int W = Integer.parseInt(str[0]);
    //H???height
    int H = Integer.parseInt(str[1]);
    //x:??????x??§?¨?,y:??????y??§?¨?,r:????????????
    int x = Integer.parseInt(str[2]);
    int y = Integer.parseInt(str[3]);
    int r = Integer.parseInt(str[4]);
    	
    if((-100 <= x && x <= 100 ) && ( -100 < y && y <= 100 )&&
    	( 0 < W && W <= 100 ) && ( 0 < H && H <= 100 ) && ( 0 < r && r <= 100)){
    	if( 0 <= x+r && x+r <= W && 0 <= y+r && y+r <= H &&
    	    0 <= x-r && x-r <= W && 0 <= y-r && y-r <= H){
    		System.out.println("Yes");
    	}else System.out.println("No");        
    } else System.out.println("No"); 
	}
}