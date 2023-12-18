import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 1;
        for(int i=2; i<=x; i++){
            int b = i * i;
            while(b <= x){
                ans = Math.max(ans, b);
                b = b*i;
            }
        }
        System.out.println(ans);
    }
}
