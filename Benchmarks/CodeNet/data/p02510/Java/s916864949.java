import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int m;
		int h;
        
        while(true){
        	str = br.readLine();
        	if(str.equals("-")){
        		break;
        	}
        	m = Integer.parseInt(br.readLine());
        	
        	for(int i=0;i<m; i++){
        		h = Integer.parseInt(br.readLine());
        		str = shuffle(str, h);
        	}
        	System.out.println(str);
        	
        }
        
	}
	
	public static String shuffle(String str, int h){
		String left = str.substring(0, h);
		String right = str.substring(h, str.length());
		return (right + left);
	}
}