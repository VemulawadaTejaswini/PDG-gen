import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int h=kbd.nextInt();
   int m=kbd.nextInt();
   int ht=kbd.nextInt();
   int mt=kbd.nextInt();
   int k=kbd.nextInt();
   int u=h*60+m;
   int s=ht*60+mt;
   System.out.println(s-u-k);
 }
}
