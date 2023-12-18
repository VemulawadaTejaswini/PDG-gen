import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long ans = (long)Math.ceil(Math.sqrt(x)) *3;
        while(true){
            long tmp = ans;
            tmp--;
            if(tmp * (tmp + 1) / 2 < x) break;
            ans = tmp;
        }

        System.out.println(ans);
        sc.close();
    }

}
