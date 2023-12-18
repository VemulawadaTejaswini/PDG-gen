import java.util.Scanner;
public class Main {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
// 2つの文字の固まりをそれぞれ整数値と想定して読み込む
int a = sc.nextInt();
int b = sc.nextInt();
int area = a*b;
int length = 2*a+2*b;
System.out.println(area + " " + length);
sc.close();
}
}

