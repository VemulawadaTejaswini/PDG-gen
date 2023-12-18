import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    String[] str = new String[n];
    int[] ans = new int[4];
    for(int i=0; i<n; i++){
      str[i] = scanner.nextLine();
    }
    
    for(int i=0; i<n; i++){
      String s = str[i];
      switch(s){
        case "AC":
        ans[0] ++;
        break;

        case "WA":
        ans[1] ++;
        break;

        case "TLE":
        ans[2] ++;
        break;

        case "RE":
        ans[3] ++;
        break;
      }
    }
    

    System.out.println("AC x "+ans[0]);
    System.out.println("WA x "+ans[1]);
    System.out.println("TLE x "+ans[2]);
    System.out.println("RE x "+ans[3]);
    
    scanner.close();
    return;
  }
  
}
