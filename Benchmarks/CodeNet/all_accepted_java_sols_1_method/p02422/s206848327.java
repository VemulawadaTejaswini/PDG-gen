import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());
        for (int i=0; i<count; i++) {
            String  request = sc.next(); //命令
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (request.equals("print")) {
                System.out.println(str.substring(a, b+1));
            } else if (request.equals("reverse")) {
                StringBuffer sb = new StringBuffer(str.substring(a, b+1));
                String rs = sb.reverse().toString();
                str = str.substring(0, a) + rs + str.substring(b+1, str.length());
            } else if (request.equals("replace")) {
                String p = sc.next();
                str = str.substring(0, a) + p + str.substring(b+1, str.length());
            }
        }
    }
}

