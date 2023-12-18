import java.io.*;

class ITP1_1_B{
  public static void main(String[] args) throws IOException{
    DataInputStream d = new DataInputStream(System.in);
    String s = d.readLine();
    int i = Integer.parseInt(s);
    System.out.println(i * i * i);
  }
}