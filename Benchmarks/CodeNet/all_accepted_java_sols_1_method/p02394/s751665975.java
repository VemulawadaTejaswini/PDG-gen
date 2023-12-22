import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in), 1);
        String is = br.readLine();
        String[] sp = is.split(" ");
 
        int W = Integer.parseInt(sp[0]);
        int H = Integer.parseInt(sp[1]);
        
        int x = Integer.parseInt(sp[2]);
        int y = Integer.parseInt(sp[3]);
        int r = Integer.parseInt(sp[4]);
 
        if(x - r < 0){
        	// ???????????????????????????
        	System.out.println("No");
        	return;
        }else if(y - r < 0){
        	// ???????????????????????????
        	System.out.println("No");
        	return;
        }else if(x + r > W){
        	// ???????????????????????????
        	System.out.println("No");
        	return;
        }else if(y + r > H){
        	// ???????????????????????????
        	System.out.println("No");
        	return;
        }else{
        	System.out.println("Yes");
        }
       	return;
    }
}