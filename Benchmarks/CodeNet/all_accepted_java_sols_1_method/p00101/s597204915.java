import java.io.*;
class Main{
    public static void main(String[] args)throws IOException{
	BufferedReader br =
	    new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	for(int i=0;i<n;i++){
	    String buf = br.readLine();
	    System.out.println(buf.replaceAll("Hoshino","Hoshina"));
	}
    }
}