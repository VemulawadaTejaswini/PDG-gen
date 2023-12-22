import java.io.*;
public class Main{
  public static void main(String[] args){
    try{
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      int X, Y, Z;
      String[] temp = bf.readLine().split(" ");
      X = Integer.parseInt(temp[0]);
      Y = Integer.parseInt(temp[1]);
      Z = Integer.parseInt(temp[2]);
	  int n = (X-Z)/(Y+Z);
      System.out.println(n);
    } catch(IOException e){}
  }
}
    