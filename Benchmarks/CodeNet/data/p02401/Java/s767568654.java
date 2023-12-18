import java.io.*;
import java.util.ArrayList;
public class Main{
	public static void main(String args[]){
    int a,b,ans = 0;
    String calc;
    ArrayList<Integer> ansArray = new ArrayList<Integer>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
      while (true) {
        String line = reader.readLine();
        String[] splitted = line.split(" ");
          a = Integer.parseInt(splitted[0]);
          calc = splitted[1];
          b = Integer.parseInt(splitted[2]);
          switch(calc){
            case "+":
              ans = a + b;
              ansArray.add(ans);
              continue;
            case "-":
              ans = a - b;
              ansArray.add(ans);
              continue;
            case "*":
              ans = a * b;
              ansArray.add(ans);
              continue;
            case "/":
              ans = a / b;
              ansArray.add(ans);
              continue;
            case "?":
              break;
            default:
              break;
          }
          break;
          
      }
      
		}catch(Exception e){
      a = 0;
      b = 0;
    }

    for (int item : ansArray){
      System.out.println(item);
  }
		
	}
}
