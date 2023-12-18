import java.util.Scanner;

public class Main {

public static void main(String[] args){
Scanner input = new Scanner(System.in);
int a = input.nextInt();
int b = input.nextInt();
String output = "";
if (a-b > 0) {
 output = "a > b";
} else if(a-b<0){
output = "a < b";
} else {
output = "a == b";
}
System.out.println(output);
}
}
