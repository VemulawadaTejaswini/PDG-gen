import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        int i = 0, x;

        InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader br =new BufferedReader(isr);
    	String buf = br.readLine();
    	x = Integer.parseInt(buf);
        
        while(true) {
        	if (x == 0) break;
            i++;
        	System.out.printf("Case %d: %d\n", i, x);
        	buf = br.readLine();
    		x = Integer.parseInt(buf);
    	}
    }
}