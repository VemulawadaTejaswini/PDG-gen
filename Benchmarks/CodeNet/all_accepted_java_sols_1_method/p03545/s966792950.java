import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String s = sc.next();
        String[] list = s.split("");
        int[] constList = new int[3];
        int a = Integer.parseInt(list[0]);
        for (int i = 0; i < 3; i++) {
          constList[i] = Integer.parseInt(list[i + 1]);
        }
        
        String ans = list[0];
        
        for (int i = 0; i < 8; i++) {
          String bin = "";
          if (i < 2) {
            bin += "00";
          } else if (i < 4) {
            bin += "0";
          }
          bin += Integer.toBinaryString(i);
          String[] oprList = bin.split("");
          int sum = a;
          
          for (int index = 0; index < 3; index++) {
            if (oprList[index].equals("0")) {
              sum += constList[index];
            } else {
              sum -= constList[index];
            }
          }
          
          if (sum == 7) {
            for (int index = 0; index < 3; index++) {
              if (oprList[index].equals("0")) {
                ans += "+" + list[index + 1];
              } else {
                ans += "-" + list[index + 1];
              }
            }
            ans += "=7";
            break;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}