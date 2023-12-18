import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        long a[] = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            if(a[i]==0){
                ans=0;
                break;
            }
        }
        if(ans==0){
            System.out.println(ans);
        }
        else{
            for(int i = 0; i < n; i++){ 
                ans *= a[i];
                if(ans > (long)Math.pow(10,18)){
                    ans = -1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
