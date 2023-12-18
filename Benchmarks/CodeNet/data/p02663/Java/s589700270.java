import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt()*60;
        int m1 = sc.nextInt();
        int h2 = sc.nextInt()*60;
        int m2 = sc.nextInt();
        int k = sc.nextInt();

        int life = (h2+m2) - (h1+m1);
        int ans = 0;
        if(life%k == 0){
            ans = k*(life/k) <= k ? 0:k*(life/k)-k;
            }else{
                ans = k*(life/k);
            }


        System.out.println(ans);
    }
}