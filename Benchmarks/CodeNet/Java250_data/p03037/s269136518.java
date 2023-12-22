import java.util.*;


public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        for(int i = 0; i < m; i++){
            l[i] = scan.nextInt();
            r[i] = scan.nextInt();
        }
        int min = 0;
        int max = (int)Math.pow(10, 5) + 1;
        for(int i = 0; i < m; i++){
            if(min < l[i]) min = l[i];
            if(max > r[i]) max = r[i];
        }
        System.out.println(max >= min ? max - min + 1 : 0);
        scan.close();
    }
}