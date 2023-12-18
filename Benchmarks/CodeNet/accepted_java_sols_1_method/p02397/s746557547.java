import java.util.Scanner;

class Main {
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
int i = 1;
while(i < 3000){
int x = sc.nextInt();
int y = sc.nextInt();
if (x >= 0 && x <= 10000){
if (y >= 0 && y <= 10000){
if ((x == 0) && (y == 0)) {
break;
}else{
if (x <= y){
System.out.println(x + " " + y);
}else{
System.out.println(y + " " + x);
}
}
}
}
}
}
}
