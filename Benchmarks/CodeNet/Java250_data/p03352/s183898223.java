import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;
        boolean[] ok = new boolean[x+1];
        ok[1] = true;
        for(int i = 2;i <= x;i++){
            int v = i*i;
            while(v<=x){
                ok[v] = true;
                v *= i;
            }
        }

        for(int i = x;i >= 1;i--){
            if(ok[i]){
                System.out.println(i);
                break;
            }
        }
    }
}