import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       for(;;) {
           int n=sc.nextInt();
           if(n==0) {
               break;
           }
           int m=sc.nextInt();
           String s=sc.next();
           String t="I";
           for(int i=0;i<n;i++) {
               t+="OI";
           }
           int count=0;
           for(int i=0;i<m-t.length();i++) {
               if(s.substring(i,i+t.length()).equals(t)) {
                   count++;
               }
           }
           System.out.println(count);
       }
    }
}
