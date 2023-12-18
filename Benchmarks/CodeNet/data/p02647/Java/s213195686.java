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
      for (int i = 1; i < result.length-1; i++) {
          int bef = result[i-1];
          int now = result[i];
          int next = result[i+1];
          
          result[i-1] = bef + now;
          result[i] = now + bef;
          result[i+1] = now + next;
      }
    }
    
    StringBuilder sb = new StringBuilder();
    for (int i=0; i<result.length; i++){
      if (i!=0) {
        sb.append(" ");
      }
      sb.append(result[i]);
    }
    sb.append("\n");
    System.out.println(sb.toString());
  }
}
