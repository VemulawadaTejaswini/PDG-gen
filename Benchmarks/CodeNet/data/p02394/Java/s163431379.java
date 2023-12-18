import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	String[] str=line.split(" ");
            	int w=Integer.parseInt(str[0]);
            	int h=Integer.parseInt(str[1]);
            	int x=Integer.parseInt(str[2]);
            	int y=Integer.parseInt(str[3]);
            	int r=Integer.parseInt(str[4]);
            	
            	if(w>=x+r&&x-r>=0&&y-r>=0&&y+r<=h){
            		System.out.println("Yes");
            	}else{
            		System.out.println("No");
            	}
            	break;
            }
        }
    }
}