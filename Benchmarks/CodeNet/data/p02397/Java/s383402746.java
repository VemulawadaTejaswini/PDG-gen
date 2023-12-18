import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        while(true){
            String strArr[] = br.readLine().split(" ");
            int x = Integer.parseInt(strArr[0]);
            int y = Integer.parseInt(strArr[1]);
            //int  x = br.nextInt();
            //int  y = br.nextInt();
            if ( x == 0 && y == 0 ) break;
            
            if(x > y) {
                System.out.println(y + " " + x);
            } else {
                System.out.println(x + " " + y);
            }
        }
	}
}
