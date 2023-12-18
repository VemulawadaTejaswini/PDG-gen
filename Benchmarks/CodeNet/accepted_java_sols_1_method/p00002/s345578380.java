import java.util.*;
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
while(sc.hasNextInt()){
int a, b = 0;
a = sc.nextInt();
b = sc.nextInt();
System.out.println(String.format("%d", a+b).length());
}
}
}