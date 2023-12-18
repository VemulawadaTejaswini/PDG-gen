import java.io.*;  

public class RectArea {
    public static void main(String[] args) throws IOException {
	int height;                                         // ?????°?????£?¨??????????
	int width;                                          // ?????°?????£?¨?????¨????
	int area;                                           // ?????°?????£?¨??????¢??????
    int l;
	/* ??\???????????? */
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String buf = br.readLine();
    String[] x = buf.split(" ",0);
    	//for(int i=0;i<x.length;i++){
        //System.out.println(x[i]);
    	//}
    	
    	height=Integer.parseInt(x[0]);
    	width=Integer.parseInt(x[1]);
	    area = height*width;
	    l = height + width+height + width;
	    System.out.println(l+" "+ area );
    
	
    }
    
}