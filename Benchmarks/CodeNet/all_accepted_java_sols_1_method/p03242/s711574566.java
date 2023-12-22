import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
      line=line.replace("1",",");
      line=line.replace("9","1");
      line=line.replace(",","9");
        System.out.println(line);
    }
}