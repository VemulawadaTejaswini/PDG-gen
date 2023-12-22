import java.util.Scanner;

class Main {
public static void main (String[] args){
int count = 0;
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if (a >= 1 && a <= 10000){
if (b >= 1 && b <= 10000){
if (c >= 1 && c <= 10000){
if (a <= b) {
for (int i = a ; i <= b ; i++){
if (c % i == 0){
count++;
}
}
System.out.println(count);
}
}
}
}
}
}

