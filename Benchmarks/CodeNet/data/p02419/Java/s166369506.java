import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int n,count;
    public static String s,w;
    public static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        count=0;
        s=sc.next();
        s=s.toUpperCase();
        while(true){
            w=sc.next();
            if(w.equals("END_OF_TEXT")){
                System.out.printf("%d\n",count);
                sc.close();
                return;
            }
            w=w.toUpperCase();
            if(w.equals(s)) count++;
        }
    }
}
