import java.io.*;
class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    String[] array = line.split(" ");
    if (!(array.length == 3))
      return;
    int a = Integer.parseInt(array[0]);
    int b = Integer.parseInt(array[1]);
    int c = Integer.parseInt(array[2]);
    if(a < b && b < c) {System.out.println("Yes");}
    else {System.out.println("No");}
  }
}