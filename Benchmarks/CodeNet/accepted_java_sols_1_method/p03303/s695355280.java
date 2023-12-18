import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
String s[]=line.split("",0);
String a=sc.nextLine();
int i=Integer.parseInt(a);
for(int j=0;j<s.length;j+=i)
        System.out.print(s[j]);
    }
}