import java.io.*;

class Main { 
  public static void main(String[] args)throws IOException

{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
    String str=br.readLine();
    String str2=br.readLine();
    int a =Integer.parseInt(str);
    int b=Integer.parseInt(str2);
	
	System.out.print(a*b);
	System.out.print(" ");
    System.out.println(a*2+b*2);
	
	
  }
}