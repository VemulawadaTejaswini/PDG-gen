import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String t = sc.next();
// まずstrArraySubに1文字多い配列を作る
String[] strArray = new String[t.length()];
 String[] strArray2 = new String[t.length()];
            // 変数strの長さ分回す
            for (int i = 0; i < t.length(); i++) {
                // strの先頭から1文字ずつString型にして取り出す
                String str = String.valueOf(t.charAt(i));
                // 配列に順番に格納する
                strArray[i] = str;
            }
               StringBuffer buf = new StringBuffer();
          for (int i = 0; i < strArray.length; i++) {
                                          if(strArray[i].equals("?")){
                                            strArray2[i]="D";
                                          }else{
                                          strArray2[i]=strArray[i];
                                          }


              buf.append(strArray2[i]);
          }
      String str2= buf.toString();
		// 出力
		System.out.println(str2);
	}
}