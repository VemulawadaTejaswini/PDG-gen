import java.io.*;

public class Main{
  public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line=null;
        while((line=br.readLine())!=null){
        	String[] array=line.split(" ");
        	int sum=Integer.parseInt(array[0])+Integer.parseInt(array[1]);
        	System.out.println(String.valueOf(sum).length());
        }
    }
}