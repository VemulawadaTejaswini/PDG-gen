
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String[] str = n.split(" ");
        
        int W = Integer.parseInt(str[0]);
        int H = Integer.parseInt(str[1]);
        int x = Integer.parseInt(str[2]);
        int y = Integer.parseInt(str[3]);
        int r = Integer.parseInt(str[4]);
        
        if(((x-r<0)||(x+r>W))||((y-r<0)||(y+r>H))){
        	System.out.println("No");
        }else{
        	System.out.println("Yes");
        }
        
        
	}
}