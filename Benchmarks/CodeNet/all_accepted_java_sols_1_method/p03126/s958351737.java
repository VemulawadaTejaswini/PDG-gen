import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[31];
        int cnt = 0;

        for(int i = 0;i<n;i++){
            a[i] = 0;
        }


        for(int i = 0;i<n;i++){
            int k = sc.nextInt();
            for(int j = 0;j<k;j++){
                int num = sc.nextInt();
                a[num]++;               
            }
        }

        for(int i =0;i<31;i++){
            if(a[i]==n){
            cnt++;
            }
        }

        System.out.println(cnt);

    }
}
