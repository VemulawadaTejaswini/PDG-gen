import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int t = a;
        a = b;
        b = t;
        t = a;
        a = c;
        c = t;
        System.out.printf("%d %d %d", a, b, c);

    }
}