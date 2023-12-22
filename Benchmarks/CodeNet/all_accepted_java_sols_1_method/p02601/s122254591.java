import org.w3c.dom.ls.LSOutput;
import java.util.*;
public class Main {
    static boolean visited[] = new boolean[1002];
    static boolean counted[] = new boolean[1002];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[3];
        for (int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        int n = sc.nextInt();
        while (a[1]<=a[0]){
            a[1]<<=1;
            n--;
        }
        while (a[2]<=a[1]){
            a[2]<<=1;
            n--;
        }
        System.out.println(n>=0?"Yes":"No");
    }
}




