import java.util.*;

public class Main {
	public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        long ans = 0;
        long max = 0;
        long work = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            work = sc.nextLong();
            if (i != 0 && work < max) {
                ans += (max - work);
            }else if(work > max){
                max = work;
            }
        }
        sc.close();
        System.out.println(ans);   
      }
}