import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n + 1];
        for(int i = 0 ; i < n ; i++ ){
            h[i] = sc.nextInt();
        }
        h[n] = h[n - 1] + 1;
        sc.close();
        int s = 0 , a = 0;
        for(int i = 0 ; i < n ; i++){
            if(h[i] >= h[i + 1]){
                a++;
            }else{
                if(s < a){
                    s = a;
                }
                a = 0;
            }
        }
        System.out.println(s);
    }
}