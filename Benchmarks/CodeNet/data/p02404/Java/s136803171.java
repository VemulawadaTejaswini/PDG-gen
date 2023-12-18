import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main {
    public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while((line = br.readLine()) != null){
            	String lines[] = line.split(" ");
            	int height = Integer.parseInt(lines[0]);
            	int width = Integer.parseInt(lines[1]);

            	if(height==0||width==0)break;
            	for(int i=0;i<height;i++){
            		for(int j=0; j<width; j++){
            			if(i==0 || i==height-1){
            				System.out.print("#");
            			}else{
            				System.out.print((j==0 || j==width-1) ? "#" : ".");
            			}
            		}
            		System.out.println("");
            	}
            	System.out.println("");
            }
    }
}