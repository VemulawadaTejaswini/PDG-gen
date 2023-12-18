import java.io.*;
class Xcubic {
	static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
        	String line = reader.readLine();
        	int x = Integer.parseInt(line);
        	int y = (x * x * x);
        	if (x >= 2 && x <= 100) {
        		System.out.println(y);
        	} else {
        		System.out.println("error:number is 1 to 100");
        	}
        } catch (IOException e) {
          System.out.println(e);
        } 
      }
    }