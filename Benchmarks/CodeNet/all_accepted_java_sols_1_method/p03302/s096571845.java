import java.util.*;
 
 
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
 
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
String s[]=line.split(" ",0);
int i=Integer.parseInt(s[0]);
int j=Integer.parseInt(s[1]);
if(i*j==15)
        System.out.println("*");
else if(i+j==15)System.out.println("+");
else System.out.println("x");
    }
}