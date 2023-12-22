import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
while (true) {
String x= sc.next();

if (x.equals("0")) break;
int ans=0;
for(int i=0;i<x.length();i++)ans += x.charAt(i)-'0';
System.out.println(ans);

}
}
}
