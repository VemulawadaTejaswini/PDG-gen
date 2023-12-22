import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n];
        for(int i = 1 ; i <= n ; i++ ){
            p[i - 1] = sc.nextInt(); 
        }
        for(int i = 1; i <= n ; i++ ){
            for(int j = 0 ; j < n - 1 ; j++ ){
                if(p[j] > p[j + 1]){
                    int ko = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = ko;
                }
            }
        }
        int s = 0;
        for(int i = 0 ; i < k ; i++ ){
            s = s + p[i];
        }
        System.out.println(s);
    }
}