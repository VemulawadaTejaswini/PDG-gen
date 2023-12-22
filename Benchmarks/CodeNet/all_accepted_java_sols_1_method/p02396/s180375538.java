import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 

 public static void main(String[] args) throws NumberFormatException, IOException {
  // TODO 自動生成されたメソッド・スタブ
   InputStreamReader is = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(is);
   int count = 1;
   int input = Integer.parseInt(br.readLine());
   while (input != 0) {
    System.out.println("Case"+" "+count+": "+input);
    input = Integer.parseInt(br.readLine());
    count++;
   }
  
 
 }
}
