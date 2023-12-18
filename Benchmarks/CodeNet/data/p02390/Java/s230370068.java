import java.io.*;
class Main{
	 public static void main(String args[])throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String buf = br.readLine();
	int x = Integer.parseInt(buf);
	
    int y = x/3600;
    int z = (x % 3600) / 60;
    int w = (x % 3600) % 60;
	System.out.println(y + " " + z + " " + w);
	}
	}