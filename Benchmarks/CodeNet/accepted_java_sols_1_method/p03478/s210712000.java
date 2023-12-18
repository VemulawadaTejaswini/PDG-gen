import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int maxNum = sc.nextInt();
    int over = sc.nextInt();
    int under = sc.nextInt();

    int ans = 0;

    for(int num=1; num<=maxNum ; num++){
        String numStr = String.valueOf(num);
        if(numStr.length() == 1){
            int incNum = Integer.parseInt(numStr);
            if(incNum >= over && incNum <= under){
                ans += num;
            } 
        }else {
            int plusNum = 0;
            for(char charNum : numStr.toCharArray()){
                plusNum += Integer.parseInt(String.valueOf(charNum));
            }
            if(plusNum >= over && plusNum <= under){
                ans += num;
            }
        }
    }

    System.out.println(ans);
  }
}