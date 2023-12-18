import java.io.*;
import java.util.Date;

class Main{
  public static void main(String[] args)throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
	
	int x = Integer.parseInt(str);
    int h = x/3600;
    int m = x%3600/60;
    int s = x%60;

	System.out.println(h + ":" + m + ":" + s);
  }
}