import java.util.Scanner;
public class Main {
     
    static char[] k = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
     
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String str = stdIn.next();
        int q = stdIn.nextInt();
        for(int i = 0; i < q; i++) {
            String stt = stdIn.next();
            if(stt.equals("print")) {
                int a = stdIn.nextInt();
                int b = stdIn.nextInt();
                String tmp = str.substring(a, b+1);
                System.out.println(tmp);
            }
            else if(stt.equals("reverse")) {
                int a = stdIn.nextInt();
                int b = stdIn.nextInt();
                String tmp = str.substring(a,b+1);
                String tmp2 = "";
                for(int j = tmp.length()-1; j >= 0; j--) {
                    tmp2 += String.valueOf(tmp.charAt(j));
                }
                String ck1 = str.substring(0, a);
                String ck2 = str.substring(b+1,str.length());
                str = ck1 + tmp2 + ck2;
            }
            else if(stt.equals("replace")) {
                int a = stdIn.nextInt();
                int b = stdIn.nextInt();
                String p = stdIn.next();
                String ck1 = str.substring(0, a);
                String ck2 = str.substring(b+1,str.length());
                str = ck1 + p + ck2;
                 
            }
        }
    }
}
