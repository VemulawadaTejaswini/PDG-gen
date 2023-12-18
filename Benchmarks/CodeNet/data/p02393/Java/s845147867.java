import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
int b = scanner.nextInt();
int c = scanner.nextInt();
int x;
if(b < a){
x = a;
a = b;
b = x;
}
if(c < b){
x = b;
b = c;
c = x;
}
if(b < a){
x = a;
a = b;
b = x;
}
System.out.println(a +" "+ b +" "+ c);
}
}
