import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in), 1);
        String s;
        while(true){
        	s = br.readLine();
        	String[] xy = s.split(" ");
        	int x = Integer.parseInt(xy[0]);
        	int y = Integer.parseInt(xy[1]);
        	if (x==0 && y==0)
        		return;
        	System.out.println(Math.min(x, y) + " " + Math.max(x, y));
        }
    }
}