import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            do{
            	String[] in = line.split(" ", 0);
            	String data = "" + (Integer.parseInt(in[0]) + Integer.parseInt(in[1]));
            	System.out.println(data.length());
            	line = br.readLine();
            }while(line != null);
           	


        }catch (Exception e) {
			// TODO: handle exception
        	System.exit(0);
		}
		
	}

}