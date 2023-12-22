import java.io.*;
class Main{
    public static void main(String[] args)throws IOException{
    	InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader br =new BufferedReader(isr);
    	String buf = br.readLine();
    	int x = Integer.parseInt(buf);
    	int y = x*x*x;
        System.out.println(y);
    }
}