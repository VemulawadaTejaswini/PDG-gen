import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		
		 try {
	            InputStreamReader isr = new InputStreamReader(System.in);
	            BufferedReader br = new BufferedReader(isr);
	            String buf = br.readLine();
	            StringTokenizer st=new StringTokenizer(buf," ");
	            int W = Integer.parseInt(st.nextToken());   //??????(H)???height
	            int H = Integer.parseInt(st.nextToken());   //???(W)???wide
	            int x = Integer.parseInt(st.nextToken());   //x???????¨? ????????¢???
	            int y = Integer.parseInt(st.nextToken());   //y????????? ???????????¢???
	            int r = Integer.parseInt(st.nextToken());   //??????
	 
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