import java.io.*;
class Main {
	public static void main(String[] args)throws Exception{
  int x;
  int y = 0;
  System.out.print("input integer:")
     InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
  
  	String buf = br.readLine();
  	x = Integer.parseInt(buf);
      y = x * x * x;

  		System.out.println(y);
  		}
  		}