import java.io.*;

class Main{
  public static void main (String[] args) throws IOException{
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    String strnum = r.readLine();
    String[] arr = strnum.split(" ");
    int a = Integer.parseInt(arr[0]);
    int b = Integer.parseInt(arr[1]);
    System.out.println((a * b) + " " +(a*2 + b*2));
  }
}