import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String input = sc.next();

String letter3 = input.substring(2, 3);
String letter4 =  input.substring(3, 4);
String letter5 = input.substring(4, 5);
String letter6 =  input.substring(5, 6);

if(letter3.equals(letter4) && letter5.equals(letter6)) {
	System.out.println("Yes");
}else {
	System.out.println("No");
}
}
}
