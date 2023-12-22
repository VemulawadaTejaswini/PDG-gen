import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        int count = 0;
        for(int i=0; i<s.length()-2; i++) {
            String ss = s.substring(i, i+3);
            if("ABC".equals(ss)) count++;
        }
        System.out.println(count);
    }
}