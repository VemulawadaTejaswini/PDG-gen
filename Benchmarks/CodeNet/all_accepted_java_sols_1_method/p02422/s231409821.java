import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String com = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt()+1;
            if ("replace".equals(com)) {
                String str2 = sc.next();
 
                str = str.replace(a,b, str2);
            } else if ("reverse".equals(com)) {
 
                StringBuilder temp  = new StringBuilder(str.substring(a, b));
                temp.reverse();
                str.replace(a, b, temp.toString());
 
            } else if ("print".equals(com)) {
 
                System.out.println(str.substring(a, b));
            }
        }
        sc.close();
    }
    
}