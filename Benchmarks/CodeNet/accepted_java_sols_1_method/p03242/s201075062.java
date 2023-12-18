import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
    String data = String.valueOf(a);
    String answer = "";

    for (int i = 0; i < data.length(); i++) {
      String num = String.valueOf(data.charAt(i));
      int n = Integer.parseInt(num);
      if (n == 9) {
        answer += "1";
      } else {
        answer += "9";
      }
    }
    System.out.println(answer);
	}
}
