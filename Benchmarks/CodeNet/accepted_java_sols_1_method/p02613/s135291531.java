import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = Integer.parseInt(scan.nextLine());
	String[] judge = {"AC", "WA", "TLE", "RE"};
    int[] count = {0, 0, 0, 0};
    
    for (int i=0; i<N; i++) {
      String tmp = scan.nextLine();
      
      switch(tmp) {
        case "AC":
            count[0]++;
         	break;
        case "WA":
            count[1]++;
         	break;
        case "TLE":
            count[2]++;
         	break;
        case "RE":
            count[3]++;
         	break;
      }
    }
    
    for (int i=0; i<4; i++) {
      System.out.println(judge[i] + " x " + count[i]);
    }
  }
}
