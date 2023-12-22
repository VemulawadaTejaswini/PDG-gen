import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(line[0]),
            num2 = Integer.parseInt(line[2]);
        if(line[1].equals("+")) System.out.println(num1+num2);
        else System.out.println(num1-num2);
    }
}