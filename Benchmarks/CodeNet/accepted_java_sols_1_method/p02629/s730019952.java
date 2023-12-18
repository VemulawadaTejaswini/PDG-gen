import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       long n = s.nextLong();
       int rem=0;
       String name = "";
       char c;
       while(n>0) {
           rem =(int) ((n-1) % 26);
           c = (char)('a'+rem);
           name+=c;
           n= (n-1) /26;
       }
       for(int i=name.length()-1;i>=0;i--) {
           System.out.print(name.charAt(i));
       }
   }
}
