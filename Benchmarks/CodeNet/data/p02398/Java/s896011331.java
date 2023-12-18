import java.io.*;
public class Main {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
        	String[] num = line.split(" ", -1);
        	int a = Integer.parseInt(num[0]);
        	int b = Integer.parseInt(num[1]);
        	int c = Integer.parseInt(num[2]);
        	int n = 0;
        	for (int i = a; i <= b; i++) {
        		if((c % i) == 0) {
        			n = n + 1;
        		} else {
        			//nothing
        		}
        	}
        	System.out.println(n);
        } catch (IOException e) {
          System.out.println(e);
        } catch (NumberFormatException e) {
          System.out.println("error");
        }
    }
}