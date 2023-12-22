import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] l = new int[n];
        int d = 0;
        for(int i = 0 ; i < n ; i++ ){
            l[i] = sc.nextInt();
        }
        boolean in = false;
        int s = 0;
        while(in == false){
            d += l[s];
            if(x < d || s == n - 1){
                in = true;
            }else{
                s++;
            }
        }
        int a = 0;
        for(int i = 0 ; i < n ; i++ ){
            a += l[i];
        }
        if(x >= a){
            s++;
        }
        s++;
        System.out.println(s);
    }
}