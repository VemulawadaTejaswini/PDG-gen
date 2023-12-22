import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int count = 0;
        for(int i=0; i<a-2; i++) {
            if("ABC".equals(b.substring(i, i+3))) {
                count++;
            }
        }
        System.out.println(count);
    }
}