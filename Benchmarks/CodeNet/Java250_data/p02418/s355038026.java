import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        sc.close();
        //sをつなげる
        s = s + s;
        //条件分岐
        String result = s.contains(p) ? "Yes":  "No";
        //結果表示
        System.out.println(result);
        

    }

}