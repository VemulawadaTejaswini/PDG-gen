import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long cnt = 0;
        for(int i = 1;i <= n/2;i++){
            if(n != 2*i)
                cnt++;
        }
        System.out.println(cnt);
    }
}