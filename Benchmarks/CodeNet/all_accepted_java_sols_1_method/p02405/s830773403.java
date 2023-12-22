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
            	int x=Integer.parseInt(str[0]);
            	int y=Integer.parseInt(str[1]);

            	if(x==0&&y==0){
            		break;
            	}
            	for(int i=0;i<x;i++){
            		for(int j=0;j<y;j++){
            			if((i+j)%2==0){
            				System.out.print("#");
            			}else{
            				System.out.print(".");
            			}
            		}
            		System.out.println();
            	}
            	System.out.println();
            }
        }
    }

}