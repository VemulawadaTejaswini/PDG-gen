import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        int ans = 0;

        for(int i=0;i<n;i++){
            m[i] = sc.nextInt();
        }

        for(int j=0;j<n;j++){
            if(j%2 == 0 && m[j]%2 == 1){
                    ans++;
            }
        }

        System.out.println(ans);
    } 
}