import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int A = sc.nextInt();
        int ans = 0;
        ans = H / A;
        if(H % A != 0){
            ans++;
        }

        System.out.println(ans);
    }

}




