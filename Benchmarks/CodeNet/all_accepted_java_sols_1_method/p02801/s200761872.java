import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] ch = sc.next().toCharArray();
        ch[0]++;
        System.out.println(ch[0]);
    }
}