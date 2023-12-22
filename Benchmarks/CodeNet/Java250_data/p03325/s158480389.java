import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        int ans = 0;

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            for(int j=0; j<100; j++){
                if(a[i]%2==0){
                    ans += 1;
                    a[i] = a[i] / 2;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}