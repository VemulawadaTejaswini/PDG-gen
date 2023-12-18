import java.util.Scanner;

class Main {

public static void main(String[] args) {

Scanner inp = new Scanner(System.in);
int a, b, op;
boolean start = true;

while (start == true)

Switch (op) {

case '+' :
System.out.println(a+b);
break;

case '-' :
System.out.println(a-b);
break;

case '/' :
if (b!=0) System.out.println(a/b);
break;

case '*' :
if (b!=0) System.out.println(a*b);
break;

case '?' :
start = false;
break;

}

}
}
