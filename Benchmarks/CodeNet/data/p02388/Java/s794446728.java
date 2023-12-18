import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1);

 public static void main(String args[]) {
  new Main().start();
 }

 public void start() {
  int num = 0;
  try {
  num = Integer.parseInt(reader.readLine());
  } catch(IOException e) {
   e.printStackTrace();
  }
  num = (int) Math.pow(num, 3);
  System.out.println(num);
 }

}