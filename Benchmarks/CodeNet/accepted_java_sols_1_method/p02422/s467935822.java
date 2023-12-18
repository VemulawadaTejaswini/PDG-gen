import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len=str.length();
        String[] STR = str.split("");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String q = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if (q.equals("print")) {
                System.out.println(str.substring(a, b+1));
                
            } else if (q.equals("reverse")) {
                StringBuffer sb = new StringBuffer(str.substring(a, b+1));
                String rev = sb.reverse().toString();
                str = str.substring(0, a) + rev + str.substring(b+1, str.length());
                
            } else if (q.equals("replace")) {
                String p = sc.next();
                String s1=str.substring(0,a);
                String s2=str.substring(b+1,str.length());
                str=s1+p+s2;
            }
        }
        sc.close(); 
    }
}
