import java.util.*;

class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int cnt = 0;

        int[] m = new int[n];
        for(int i = 0; i < n; i++){
            m[i] = sc.nextInt();
            if(x-m[i] >= 0){
                x -= m[i];
                cnt++;
            }
        }

        int max = 0;
        if(x != 0){
            for(int i = 0; i < n; i++){
                max = Math.max(max, x/m[i]);
            }
        }
        System.out.println(cnt+max);
        
        sc.close();
    }
}