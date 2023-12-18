import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] m = new int[n];
        int cnt = n;

        for(int i = 0;i<n;i++){
            m[i] = sc.nextInt();
            x-=m[i];
        }

        Arrays.sort(m);

        cnt = cnt+ (x/m[0]);

        //System.out.println(x);
        System.out.println(cnt);



      
    }
}
