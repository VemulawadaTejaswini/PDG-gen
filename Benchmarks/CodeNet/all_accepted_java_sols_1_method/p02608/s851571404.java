import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        //x^2+y^2+z^2+xy+yz+zx=n;
        int[] ans = new int[n+1];
        for(int x=1; x<=(int)Math.sqrt(n); x++) {
            for(int y=1; y<=(int)Math.sqrt(n); y++) {
                for(int z=1; z<=(int)Math.sqrt(n); z++) {
                    int rst = x*x+y*y+z*z+x*y+y*z+z*x;
                    if(rst <= n) {
                        ans[rst]++;
                    }
                }
            }
        }
        for(int i=1; i<ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
