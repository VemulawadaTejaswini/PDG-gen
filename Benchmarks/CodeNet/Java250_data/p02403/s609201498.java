import java.io.BufferedReader;
import java.io.InputStreamReader;

	public class Main {
	    public static void main(String[] args) throws Exception {
	        // Here your code !
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        while(true) {
		        String line = br.readLine();
		        String[] line2 = line.split(" ");
		        if(Integer.parseInt(line2[0])==0)
		        	if(Integer.parseInt(line2[1]) == 0)
		        		break;
		        print(Integer.parseInt(line2[0]),Integer.parseInt(line2[1]));
	        }
	    }
	    static void print(int w,int h) {
	    		for(int j=0;j < w;j++) {
	    	    	for(int i=0;i < h;i++) {
	    	    		System.out.print("#");
	    	    	}
		    		System.out.println();
	    		}
	    		System.out.println();
	    }
	}