import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      int S = sc.nextInt();
      int h = S / 3600;
      int amari1 = S % 3600;
      int m = amari1 / 60;
      int s = amari1 % 60;
      System.out.println(h + ":" + m + ":" + s);
    }
}
