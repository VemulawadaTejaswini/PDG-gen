import java.io.*;
 
class Main {
    public static void main(String args[]) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
	    System.out.println(br.readLine().toUpperCase());
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}