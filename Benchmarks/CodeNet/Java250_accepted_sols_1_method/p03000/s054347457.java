import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int[] l = new int[n];
        for(int i = 0; i < n; i++) l[i] = scan.nextInt();
        int p = 0;
        int c = 1;
        for(int i = 0; i < n; i++){
            p += l[i];
            if(p > x) break;
            c++;
        }
        System.out.println(c);
        scan.close();
    }
}