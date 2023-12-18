import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	public static void main(String[] args) throws IOException{
	    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	    int [] mountainsheight= new int[10];
        for (int i = 0; i < 10; i++) {
        	mountainsheight[i]=Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < mountainsheight.length-1; i++) {
        	for (int j = i + 1; j < mountainsheight.length; j++) {
        		if (mountainsheight[i] < mountainsheight[j]) {
        			int temporary = mountainsheight[i];
        			mountainsheight[i] = mountainsheight[j];
        			mountainsheight[j] = temporary;
        		}
        	}
        }
        
        for (int i = 0; i < 3; i++) {
        	System.out.println(mountainsheight[i]);
        }
	}
}