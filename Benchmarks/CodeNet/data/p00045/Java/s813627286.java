import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int  kingau = 0;
	double heikin = 0;
	int i =0;
	String buf;
	while((buf = br.readLine())!=null){
	    String[] data = buf.split(",");
	    int tanka =Integer.parseInt(data[0]);
	    int suu =Integer.parseInt(data[1]);
	    kingau += tanka * suu;
	    heikin += suu;
	    i++;
	}
	heikin /=(double)i;
	System.out.println(kingau);
	System.out.println((int)Math.floor(heikin+0.5));
    }
}
			   