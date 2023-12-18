import java.util.Scanner;
public class Main{
public static void main(String[] args) {
// 標準入力からデータを読み込む準備
try (Scanner sc = new Scanner(System.in)) {
 String line = sc.nextLine();

 int length = line.length();
  for (int i = 0; i < length; i++) {
    char ch=line.charAt(i);
    if('a' <= ch && ch <= 'z') {
    System.out.print((char)(ch - 32));
  } else if('A' <= ch && ch <= 'Z') {
    System.out.print((char)(ch + 32));
}else{
  System.out.print(ch);
}


} }
System.out.println();
}
}

