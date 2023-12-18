import java.io.*;
public class  {
public static void main(String[] args) {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
try {
System.out.println("数字を入力してください。");
String line = reader.readline();
int a = Integer.parseInt(line);
int b = Integer.paeseInt(line);
if(a < b){
  System.out.println("a < b");
}else if(a = b){
  System.out.println("a = b");
}else{
  System.out.println("a > b");
}catch(IOException e) {
System.out.println(e);
} catch (NumberFormatException e) {
System.out.println("数字の形式が正しくありません。");
}
}
}
