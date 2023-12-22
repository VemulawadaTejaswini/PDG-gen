import java.io.*;
class Main{
    public static void main (String[] args) throws IOException{

	BufferedReader br=
	    new BufferedReader(new InputStreamReader(System.in));
	String buf;
	while((buf=br.readLine())!= null){
	    String[] buf2=buf.split(" ");
	    int  data2=0;
	    for(int i=0;i!=buf2.length;i++){
		data2+=Integer.parseInt(buf2[i]);
	    }
	    String ans=(new Integer(data2)).toString();
	    System.out.println(ans.length());
	}
    }
}