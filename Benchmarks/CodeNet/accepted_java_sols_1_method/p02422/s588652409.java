import java.util.Scanner;

public class Main {

   static char[] k = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       int q = sc.nextInt();
       for(int i = 0; i < q; i++) {
           String stt = sc.next();
           int a = sc.nextInt();
           int b = sc.nextInt();
           if(stt.equals("print")) {
               String tmp = str.substring(a, b+1);
               System.out.println(tmp);
           }
           else if(stt.equals("reverse")) {
               String tmp = str.substring(a,b+1);
               String tmp2 = "";
               for(int j = tmp.length()-1; j >= 0; j--) {
                   tmp2 += String.valueOf(tmp.charAt(j));
               }
               String c1 = str.substring(0, a);
               String c2 = str.substring(b+1,str.length());
               str = c1 + tmp2 + c2;
           }
           else if(stt.equals("replace")) {
               String p = sc.next();
               String c1 = str.substring(0, a);
               String c2 = str.substring(b+1,str.length());
               str = c1 + p + c2;
           }
       }
       sc.close();
   }
}
