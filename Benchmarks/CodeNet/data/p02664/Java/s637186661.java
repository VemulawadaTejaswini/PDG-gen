import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String t = sc.next();
// まずstrArraySubに1文字多い配列を作る
String[] strArray = new String[t.length()];
 
// 変数strの長さ分回す
for (int i = 0; i < t.length(); i++) {
    // strの先頭から1文字ずつString型にして取り出す
    String str = String.valueOf(str.charAt(i));
    // 配列に順番に格納する
    strArray[i] = str;
}
 
for (int i = 0; i < strArray.length; i++) {
if(strArray[i]=="?"){
  strArray[i]=="D";
}

	StringBuffer buf = new StringBuffer();
	buf.append(strArray[i]);
}
      
		// 出力
		System.out.println(buf.toString());
	}
}