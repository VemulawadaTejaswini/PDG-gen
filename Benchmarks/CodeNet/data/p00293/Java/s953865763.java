import java.util.*;
 
import javax.xml.crypto.Data;
 
import java.math.*;
 
public class Main {
     
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] listA = new int[n];
        for(int i = 0; i < n; i++) {
            listA[i] = sc.nextInt() * 3600 + sc.nextInt() * 60;
        }
        int m = sc.nextInt();
        int[] listB = new int[m];
        for(int i = 0; i < m; i++) {
            listB[i] = sc.nextInt() * 3600 + sc.nextInt() * 60;
        }
        int[] list = new int[n + m];
        for(int i = 0; i < n; i++) {
            list[i] = listA[i];
        }
        for(int i = 0; i < m; i++) {
            list[i + n] = listB[i];
        }
         
        Arrays.sort(list);
        int pre = list[0];
        show(pre);
        for(int i = 1; i < n+m; i++) {
            if(list[i] == pre) continue;
            System.out.print(" ");
            show(list[i]);
            pre = list[i];
        }
        System.out.println();
         
    }
     
    static void show(int a) {
        int h = a / 3600;
        System.out.print(h + ":");
         
        a -= h * 3600;
        a /= 60;
        if(a < 10) {
            System.out.print("0");
        }
        System.out.print(a);
    }
     
}