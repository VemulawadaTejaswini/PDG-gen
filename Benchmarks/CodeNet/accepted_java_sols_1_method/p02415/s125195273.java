import java.util.Scanner;

public class Main {
public static void main(String[] args) {
// 標準入力からデータを読み込む準備
try (Scanner sc = new Scanner(System.in)) {
String line = sc.nextLine();
String answer = "";
int length = line.length();
for (int i = 0; i < length; i++) {
char ch = line.charAt(i); 
if(Character.isLowerCase(ch)==true){
  char o=Character.toUpperCase(ch);
  System.out.printf("%c",o);
}else{
char o=Character.toLowerCase(ch);
System.out.printf("%c",o);
}
}
System.out.println();



// 文字列(line)からi番目の文字を取り出す
// Character.isLowerCase で小文字かどうか判断可能
// Character.toUpperCase, Character.toLowerCase で変換
// 記号は上記メソッドで変換にかけても変化しない
}
//System.out.println(answer);
}
}

