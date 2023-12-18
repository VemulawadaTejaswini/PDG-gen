import java.util.Scanner;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int ones = N % 10;
       if ((ones == 2)||(ones == 4)||(ones == 5)||(ones == 7)||(ones == 9)){
            System.out.println("hon");
       }else if ((ones == 0)||(ones == 1)||(ones == 6)||(ones == 8)){
            System.out.println("pon");
       }else if (ones == 3) {
            System.out.println("bon");
       }
    }
}
        