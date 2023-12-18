import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        for(int i = 0;i < 10;i++){
            int ans = r*x-d;
            System.out.println(ans);
            x = ans;
        }
    }
}