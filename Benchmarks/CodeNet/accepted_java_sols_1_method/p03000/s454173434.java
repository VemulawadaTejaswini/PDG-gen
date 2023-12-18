import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int[] lst = new int[n+1];
        int x = Integer.parseInt(scan.next());
        for(int a = 0; a <= n; a++){
            if(a == 0){
                lst[0] = 0;
            }
            else{
                lst[a] = Integer.parseInt(scan.next());
            }
        }
        for (int a = 0; a <= n; a++) {
            if(a!=n) {
                lst[a + 1] = lst[a] + lst[a + 1];
            }
            else if(a == n){
                System.out.println(n+1);
                break;
            }
            if (lst[a + 1] > x){
                System.out.println(a + 1);
                break;
            }
        }
    }
}

