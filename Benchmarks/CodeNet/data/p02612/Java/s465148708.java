import java.util.Scanner;

Scanner scan = new Scanner(System.in);
String str = scan.nextLine();

int price = Integer.parseInt(str);
System.out.println(price % 1000);

scan.close();
