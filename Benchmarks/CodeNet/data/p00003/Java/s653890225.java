import java.io.*;
import java.util.*;
class Main{
    public static void main (String[] args) throws IOException{

	BufferedReader br=
	    new BufferedReader(new InputStreamReader(System.in));
	String buf;
	buf=br.readLine();
	int len=Integer.parseInt(buf);

	for(int i=0;i<len;i++){
	    int[] side =new int[3];
	    buf=br.readLine();
	    String[] data=buf.split(" ");
	    for(int j=0;j<len;j++){
		side[j]=Integer.parseInt(data[j]);
	    }
	    java.util.Arrays.sort(data);
	    int Phy=side[2]*side[2] - side[1]*side[1] - side[0]*side[0];
	    if(Phy==0)
		System.out.println("YES");
	    else
		System.out.println("NO");
	}
    }
}