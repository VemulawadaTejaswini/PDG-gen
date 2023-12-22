import java.util.*;

class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
String ajitama =  String.valueOf(input.charAt(0));
String chashu = String.valueOf(input.charAt(1));
String negi = String.valueOf(input.charAt(2));
int price = 0;

if(ajitama.equals("o")){
price += 100;
}
if(chashu.equals("o")){
price += 100;
}
if(negi.equals("o")){
price += 100;
}
price += 700;

System.out.println(price);
}
}