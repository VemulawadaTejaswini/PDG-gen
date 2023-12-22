import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
		// 文字列の入力
		String s = sc.next();
      byte[] asciiCodes;
        asciiCodes = s.getBytes();
      int b = 'Z';
      for (int i = 0; i < asciiCodes.length; i++) {
      	asciiCodes[i] += a;
        if (asciiCodes[i] > b) {
          asciiCodes[i] -= 26;
        }
      }
      String resultString = new String(asciiCodes);
      // 出力
		System.out.println(resultString);
      
	}
}