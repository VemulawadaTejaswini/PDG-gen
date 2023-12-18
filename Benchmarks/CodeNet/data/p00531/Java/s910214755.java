import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null ) {
            	int a=Integer.parseInt(line);
            	int b=Integer.parseInt(br.readLine());
            	int c=Integer.parseInt(br.readLine());
            	int d=Integer.parseInt(br.readLine());
            	int p=Integer.parseInt(br.readLine());
            	int x=0,y=b;

            	x=a*p;
            	if(p>c){
            		y=b+d*(p-c);
            	}
            	System.out.println(Integer.min(x,y));
            	break;
            }
		}
	}

}