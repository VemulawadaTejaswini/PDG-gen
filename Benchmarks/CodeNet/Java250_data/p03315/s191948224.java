import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if(line.equals("----"))
        System.out.println(-4);
        if(line.equals("-+--")||line.equals("+---")||line.equals("--+-")||line.equals("---+"))
        System.out.println(-2);
        if(line.equals("++--")||line.equals("+-+-")||line.equals("+--+")||line.equals("-++-")||line.equals("-+-+")||line.equals("--++"))
        System.out.println(0);
        if(line.equals("++++"))
        System.out.println(4);
        if(line.equals("+++-")||line.equals("++-+")||line.equals("+-++")||line.equals("-+++"))
        System.out.println(2);
    }
}