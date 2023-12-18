import java.util.Scanner;

public class Main{

public static void main(String[] args) {

Scanner a = new Scanner(System.in);
a.useDelimiter("\\s");
String str = a.next();
int b = Integer.parseInt(str);
String str2 = a.next();
int c = Integer.parseInt(str2); 
System.out.println(c + b);
}
}