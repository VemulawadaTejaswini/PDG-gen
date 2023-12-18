import java.io.*;
import java.util.Arrays;
 
class main {
 
	static InputStreamReader isr;
	static BufferedReader br;
	
	public static void main(String args[]) throws IOException{
	    isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		
		int c;
		while ((c = getint() ) != -1){
		    if (c!=0){
            doing( getData(c) );}else{
                System.out.println("");
            }
        }
	}
	static int getint(){
	    int n = 0;
	    try{
			String buf = br.readLine();
			n=Integer.parseInt(buf);
			
		}catch(Exception e){
		    n=-1;
		}
		return n;
	}
	static int[] getData(int n){
	    try{
	    int[] r = new int[n];
	    for(int i=0; i<n; i++){
	        r[i] = Integer.parseInt(br.readLine());
	    }
	    return r;}catch(Exception e){
	        return new int[]{};
	    }
	}
	static void doing(int[] r){
	    
	    Arrays.sort(r);
	    int sum =0;
	    for(int i=1; i<(r.length - 1); i++){
	        sum += r[i];
	    }
	    sum /= (r.length - 2);
	    
	    System.out.println(sum);
	}
}