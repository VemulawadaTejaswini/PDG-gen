import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long da[] = new long[N];
        long ans = 0;
        for(int i = 0;i<N;i++){
            da[i]=i+1;
        }
        for(int i=0;i<N;i++){
            if((da[i]%3!=0)&&(da[i]%5!=0)){
                ans = ans +da[i];
            }
        }
        System.out.println(ans);
    }

}