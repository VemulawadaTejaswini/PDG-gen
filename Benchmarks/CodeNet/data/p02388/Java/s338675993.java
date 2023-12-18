import java.io.*;
class Main
{
    public static void main(String[] args) 
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line=null;
	try {
	    line = br.readLine();
	} catch (IOException e){
	    System.out.println(e);
	}

	int x = Integer.parseInt(line);
	int y = x * x * x;
	System.out.println(y);
    }
}