import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
		String line = reader.readLine();
        	String[] num = line.split(" ", -1);
        	
        	int W = Integer.parseInt(num[0]);
        	int H = Integer.parseInt(num[1]);
        	int x = Integer.parseInt(num[2]);
      		int y = Integer.parseInt(num[3]);
      		int r = Integer.parseInt(num[4]);
      		if(x >= r && x <= (W - r) && y >= r && y <= (H - r)) {
      			System.out.println("Yes");
      		} else {
      			System.out.println("No");
      		}
 		} catch (IOException e) {
          System.out.println(e);
        } catch (NumberFormatException e) {
          System.out.println("error");
        }
    }
}