import java.util.Scanner;


public class Main { //クラス名はMain
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String rStr = scan.next();
    int r = Integer.parseInt(rStr);
     
    int S = 3*r*r;
    System.out.println(S);


    }
}