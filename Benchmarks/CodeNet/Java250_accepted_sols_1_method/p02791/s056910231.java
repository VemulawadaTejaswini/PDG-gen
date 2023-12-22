import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            p[i] = sc.nextInt();
        }
        int s = 0;
        int lo = p[0] + 1;
        for(int i = 0 ; i < n ; i++ ){
            if(lo >= p[i]){
                lo = p[i];
                s++;
            }
        }
        System.out.println(s);
        sc.close();
    }
}