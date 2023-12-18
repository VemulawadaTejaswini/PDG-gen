import java.io.*;
public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    for (int i = 0 ;; i++) {
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        char[] op = s[1].toCharArray();
        int b = Integer.parseInt(s[2]);
     
        if (op[0] == '?') {
            break;
        } else if (op[0] == '+') {
            System.out.println(a+b);
        } else if (op[0] == '-') {
            System.out.println(a-b);
        } else if (op[0] == '*') {
            System.out.println(a*b);
        } else if(op[0] == '/'){
            System.out.println(a/b);
        }
    }
    }
}