import java.util.*;
 
 
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
 
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
      String s[]=line.split(" ",0);
      int n=Integer.parseInt(s[0]);
      int m=Integer.parseInt(s[1]);
      if(n%m==0)
        System.out.println(0);
      else System.out.println(1);
    }
}