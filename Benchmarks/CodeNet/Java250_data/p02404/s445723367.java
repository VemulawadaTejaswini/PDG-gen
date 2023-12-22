import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  
public class Main{
    public static void main(String[] args) throws IOException {
        int xLine = 0;
        int yLine = 0;
        Boolean flg = true;
        
        BufferedReader br =
        		new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =
        		new StringBuilder();
        
        
        while(flg){
            String str[] = br.readLine().split(" ");
            yLine = Integer.parseInt(str[0]);
            xLine = Integer.parseInt(str[1]);

            if(xLine==0 && yLine==0) {
        		flg = false;

        	}
        	else {

        		for(int i=0; i<yLine; i++){
        			for(int j=0; j<xLine; j++){
                    	if(j>=1 && i<yLine-1 && i>=1 && j<xLine-1 ){
                    		sb.append(".");
                    		}
                    	else {
                    		sb.append("#");
                    		}
                    }
                    sb.append("\n");
                }
                sb.append("\n");
            }
        	
        }
        System.out.print(sb);
    }
}