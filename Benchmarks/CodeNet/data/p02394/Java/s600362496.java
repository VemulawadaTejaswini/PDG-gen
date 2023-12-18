import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        String ans = "";
        if(x>=r && (W-x)>=r && y>=r && (H-y)>=r){
            ans = "Yes";
        } else {
            ans = "No";
        }
        System.out.println(ans);
        sc.close();
    }
}
