import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
 private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1);
 private ArrayList<Integer> cases = new ArrayList<Integer>();

 private String inputData = null;

 public static void main(String[] args) {
  new Main().start();
 }

 public void start() {
  while (true) {
   try {
    this.inputData = reader.readLine();
   } catch (IOException e) {
    e.printStackTrace();
   }
   if (this.inputData.equals("0")) {
    break;
   }
   
   this.cases.add(Integer.parseInt(
   this.inputData));

  }

   for (int i = 0; i < this.cases.size(); i++) {
    System.out.println("Case " + i + ": " + this.cases.get(i));
   }

 }

}