import java.util.Scanner;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
      int N = in.nextInt();
       if (N%2 == 1)
            System.out.println(N/2+1);
       else
            System.out.println(N/2);
    }
}