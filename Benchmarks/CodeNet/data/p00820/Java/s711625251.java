import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0)break;
            Map<Integer,Integer>map =new HashMap<Integer,Integer>();
            for (int i = 0; i <= n; i++) {
                    map.put(i*i, i);
            }
            int ans=0;
            for (int i = 0; i <= n; i++) {
                if(i*i > n)break;
                for (int j = i; j <= n; j++) {
                    if(i*i + j*j> n)break;
                    for (int k = j; k <= n; k++) {
                        if(i*i + j*j + k*k> n)break;
                        int sum = n-(i*i+j*j+k*k);
                        if(map.containsKey(sum)){
                            if(map.get(sum) >= k){
                                ans++;
                            }
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }

}