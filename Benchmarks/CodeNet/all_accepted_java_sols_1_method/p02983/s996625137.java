import java.util.*;

class Main{
    final static long mod = 1000000007;
    //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int min = 2018;
        if(r / 2019 - l / 2019 >= 1){
            System.out.println(0);
            return;
        }
        l %= 2019;
        r %= 2019;
        for(int i = l; i <= r; i++){
            for(int j = i + 1; j <= r; j++){
                min = Math.min(min, i * j % 2019);
            }
        }
        System.out.println(min);

    }
}