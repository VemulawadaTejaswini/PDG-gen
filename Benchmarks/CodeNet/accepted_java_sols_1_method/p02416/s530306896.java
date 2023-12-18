// Sum of Number

import java.util.Scanner;

class Main{
  public static void main(String[] args){
    // Config
    Scanner sc = new Scanner(System.in);

    // Input
    while(true){
      String numStr = sc.nextLine();
      if(numStr.equals("0")){
        break;
      }

      int ans = 0;
      for(int i=0; i<numStr.length(); i++){
        String tmp = String.valueOf(numStr.charAt(i));
        ans += Integer.parseInt(tmp);
      }

      // Output
      System.out.println(ans);

    }
  }
}

