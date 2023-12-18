import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

 private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1);

 private String inputData = null;

 private String[] data;

 private int left;

 private int right;

 public static void main(String args[]) {
  new Main().start();
 }

 public void start() {
  try {
   this.inputData = reader.readLine();
  } catch (IOException e) {
   e.printStackTrace();
  }

  this.data = this.inputData.split(" ");

  this.left = Integer.parseInt(this.data[0]);
  this.right = Integer.parseInt(this.data[1]);

  if (left > right) {
   System.out.println("a > b");
  } else if (left < right) {
   System.out.println("a < b");
  } else {
   System.out.println("a == b");
  }

 }

}