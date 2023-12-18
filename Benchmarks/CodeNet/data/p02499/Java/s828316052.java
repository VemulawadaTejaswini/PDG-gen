import java.util.Scanner;
public class Main {
public static void  main(String[] args) {
// 標準入力からデータを読み込む準備
Scanner sc= new Scanner(System.in);
int[] chars = new int[256];
while(sc.hasNextLine()) {
String line = sc.nextLine();
for (int i= 0; i< line.length(); i++) {
char ch= Character.toLowerCase(line.charAt(i));
// … ch文字が出現した分，chars配列の中身を更新しよう…
chars[ch]++;
}
}
for(char ch= 'a'; ch<= 'z'; ch++) {
System.out.println(ch+ " : " + chars[ch]);
}
}
}