import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         
        int ans = 1;
        int now = 1;
         
        for(int i = 0; i < n; i++) {
            if(sc.nextInt() == 1) now++;
            else {
                ans = Math.max(ans, now);
                now = 1;
            }
        }
        ans = Math.max(ans,now);
        System.out.println(ans);
    }
}
