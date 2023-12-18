import java.io.*
public class Xcube {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
        	String line = reader.readline();
        	int x = Integer.parseInt(line);
        	if (x >= 1 && x <= 100) {
        		System.out.println(x * x * x);
        	} else {
        		System.out.println("error:number is 1 to 100");
        	}
        } catch (IOException e) {
          System.out.println(e);
        } catch (NumberFormatException e) {
          System.out.println("number format error!");
        }
      }
    }