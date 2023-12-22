import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{

	int byo=0;
	int h=0;
	int m=0;
	int s=0;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();

	byo=Integer.parseInt(str);
	h=byo/3600;
	byo=byo-(h*3600);
	m=byo/60;
	byo=byo-(m*60);
	s=byo;
	System.out.println(h+":"+m+":"+s);
    }
}