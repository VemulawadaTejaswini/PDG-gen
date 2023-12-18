import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            p[i] = sc.nextInt();
        }
        int[] q = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            q[i] = p[i] - x;
        }
        int che = -1;
        for(int i = 0 ; i < n && che == -1;i++){
            int s = 0;
            int f = 0;
            for(int t = 0 ; t < n; t++){
                if(q[t] == i){
                    s++;
                }
                if(q[t] == -i){
                    f++;
                }
            }
            if(s == 0 || f == 0){
                che = i;
            }
        }
        int se = 0;
        for(int o = 0; o < n ; o++){
            if(q[o] == -che){
                se = 1;
            }
        }
        if(n == 0){
            System.out.println(x);
        }else if(se == 1){
            System.out.println(x + che);
        }else{
            System.out.println(x - che);
        }
        sc.close();
    }
}