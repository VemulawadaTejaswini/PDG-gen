import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = null;
    
    line = sc.nextLine();
    int lampNum = Integer.parseInt(line.split(" ")[0]);
    int playCount = Integer.parseInt(line.split(" ")[1]);
    
	int[] result = new int[lampNum];
    for (int i=0; i<lampNum; i++){
      result[i] = sc.nextInt();
    }
	
    for(int j = 0; j<playCount; j++) {
      for (int i = 0; i < result.length; i++) {
        if (i != 0) {
          int tmp = result[i-1];
          result[i-1] = tmp + result[i];
          result[i] = result[i] + tmp;
        }
      }
    }
    
    for(int i=0; i<result.length; i++){
      if () {
      	System.out.print(" ");
      }
      System.out.print(result[i]);
    }
    System.out.println();
  }
}
