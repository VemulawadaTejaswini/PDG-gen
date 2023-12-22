import java.io.*;
public class Main {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
        	while(true) {
        		String line = reader.readLine();
        		String[] num = line.split(" ", -1);
        		int x = Integer.parseInt(num[0]);
        		int y = Integer.parseInt(num[1]);
        		if (x == 0 && y == 0) {
        			break;
        		} else {
        			if (x > y) {
        				System.out.println(y + " " + x);
        			} else {
        				System.out.println(x + " " + y);
        			}
        		}
        	}
        } catch (IOException e) {
          System.out.println(e);
        } catch (NumberFormatException e) {
          System.out.println("error");
        }
    }
}