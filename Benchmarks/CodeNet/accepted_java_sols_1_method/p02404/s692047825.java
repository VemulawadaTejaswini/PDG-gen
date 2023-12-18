import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
        	String[] line = br.readLine().split(" ");
        	int h = Integer.parseInt(line[0]);
        	int w = Integer.parseInt(line[1]);
        	if(h==0 && w== 0) break;
        	
        	for(int j=0;j<h;j++){
        	for(int i=0;i<w;i++){
        	if(j== 0||j==h-1 ||i ==0||i==w-1){
        		sb.append("#");
        	}else{
        		sb.append(".");
        	}
        	}
        	sb.append("\n");
        	}
        	sb.append("\n");	
        }
        System.out.print(sb);
    }
}