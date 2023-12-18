import java.io.*;

public class Main{
  public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line=br.readLine();
        while(line!=null){
        	String[] array=line.split(" ");
        	int a=Integer.parseInt(array[0]);
        	int b=Integer.parseInt(array[1]);
        	System.out.println(String.valueOf(a+b).length());
        }
    }
}