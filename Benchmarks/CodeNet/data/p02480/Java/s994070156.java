import java.io.*;

class Main{
 public static void main(String args[]){
  int i;
  BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
  i = Integer.valueOf(d.readLine()).integerValue();
  i = i * i * i;
  System.out.println(i);
 }
}