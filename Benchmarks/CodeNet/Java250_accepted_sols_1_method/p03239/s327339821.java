import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] c= new int[N];
        int[] t = new int[N];
        int min=1000;
        boolean[] check = new boolean[N];
        int count =0;
        for(int i=0;i<N;i++){
            c[i] = sc.nextInt();
            t[i] = sc.nextInt();
            if(t[i]<=T)check[i] = true;
            else check[i] = false;
        }
        for(int i=0;i<N;i++){
            if(check[i]){
                if(min>c[i]){
                    min = c[i];
                }
                count++;
            }
        }
        if(count>0)System.out.println(min);
        else System.out.println("TLE");
    }
}
