import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
    	String line = br.readLine();
    	for(int i=0;i<N;i++){
    		String[] lines = line.split(" ");
    		int a = Integer.parseInt(lines[0]);
    		int b = Integer.parseInt(lines[1]);
    		int c = Integer.parseInt(lines[2]);
    		
    		if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a){
    			System.out.println("YES");
    		}else{
    			System.out.println("NO");
    		}
    		
    		line = br.readLine();
    	}
	}
}