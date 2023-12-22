import java.io.*;
class Main
{
    public static void main(String[] args9)
    { 
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	String line=null;
	try {
	    line = br.readLine();
	} catch (IOException e) {
	    System.out.println("Input strange");
	}
	    
	String[] f= line.split(" ",0);
	int m = Integer.parseInt(f[0]);
	int n = Integer.parseInt(f[1]);
	System.out.printf("%d %d\n", m*n , 2*(m+n));
    }

}