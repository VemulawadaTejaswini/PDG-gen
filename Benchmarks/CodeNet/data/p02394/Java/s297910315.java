import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
    	
    	try {
    		InputStreamReader isr = new InputStreamReader(System.in);
    		BufferedReader br = new BufferedReader(isr);
    		String buf = br.readLine();
    		StringTokenizer st=new StringTokenizer(buf," ");
    		int W = Integer.parseInt(st.nextToken());	//高さ(H)…height
    		int H = Integer.parseInt(st.nextToken());	//幅(W)…wide
    		int x = Integer.parseInt(st.nextToken());	//x軸は横 幅に関係
    		int y = Integer.parseInt(st.nextToken());	//y軸は縦 高さに関係
    		int r = Integer.parseInt(st.nextToken());	//半径

    		if(-100 <=x && x<=100 && -100 <=y && y<=100 && 0<W && W <=100 && 0<H && H <=100 && 0<r && r <=100){

    			if( (x-r) >= 0 && (x+r) <= W && (y-r) >=0 && (y+r) <= H ){

    				System.out.println("Yes");
    			} else{
    				System.out.println("No");
    			}
    		}

    	} catch(IOException e) {
		    System.err.println(e);
		}

    }
}