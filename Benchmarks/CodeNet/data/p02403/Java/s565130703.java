import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
    	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while(true){
        	String[] input = br.readLine().split(" ");
        	int H = Integer.parseInt(input[0]);
        	int W = Integer.parseInt(input[1]);
        	if(H == 0 && W == 0){
        		break;
        	}
        	for(int x = 0 ; x < H ; x++){
        		for(int y = 0; y < W ; y++){
        			System.out.print("#");
        		}
        		System.out.println();
        	}
        	System.out.println();
        }
    }
}