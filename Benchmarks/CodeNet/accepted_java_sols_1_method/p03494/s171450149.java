import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        int count = 0;
        boolean flg = true;
        while(flg){
            for(int i = 0; i < n;i++){
                if(a[i]%2 == 0){
                    a[i] /=2;
                    if(i==n-1) count++;
                }else{
                    flg = false;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
