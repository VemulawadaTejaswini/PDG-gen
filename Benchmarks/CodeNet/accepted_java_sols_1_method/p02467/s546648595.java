

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    try {
      String strNum = br.readLine();
      sb.append(strNum + ":");
      int number = Integer.parseInt(strNum);
      
      int devideNum = 2; 
      while (number % devideNum == 0) {
        sb.append(" ");
        sb.append(devideNum);
        number /= 2;
      }
     
      devideNum++;
      while (number != 1) {
        if (number % devideNum == 0) {
          sb.append(" ");
          sb.append(devideNum);
          number /= devideNum;
        } else {
          devideNum +=2;
        }
      }

        
//      for (int i= devideNum; i <= number; i++) {
//        if (number < devideNum) {
//          break;
//        }
//        devideNum = i;
//        while ((number % devideNum) == 0) {
//          number /= devideNum;
//          sb.append(" ");
//          sb.append(devideNum);
//        }
//      }
      
    } catch (IOException e) {
      // TODO 自動生成された catch ブロック
      e.printStackTrace();
    }
    System.out.println(sb.toString());
  }

}

