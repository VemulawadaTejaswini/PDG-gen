import java.io.*;
class Main{
    public static void main(String args[]) throws IOException{
	int i=0,x=0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	for(;;)
	{
        String str = br.readLine();
	    x=Integer.parseInt(str);
	    if(x==0)break;
	    i++;
	    System.out.println("Case "+i+": "+x);
	}
    }
}