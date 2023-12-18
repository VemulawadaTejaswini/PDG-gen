import java.util.Scanner;

class Main {

public static void main(String[] args) {

Scanner inp = new Scanner(System.in);

while (true) {
int a = inp.nextInt();
String op = inp.next();
int b = inp.nextInt();

if (op.equals("?")) break;

switch (op) {

case "+" :
System.out.println(a+b);
break;

case "-" :
System.out.println(a-b);
break;

case "*" :
System.out.println(a*b);
break;

case "/" :
if (b!=0)
System.out.println(a/b);
break;

}
}
}
}
