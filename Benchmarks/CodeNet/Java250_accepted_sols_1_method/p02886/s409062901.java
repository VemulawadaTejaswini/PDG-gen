import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int cnt = 0;

        for(int i = 0; i<n;i++){
            num[i]=sc.nextInt();
        }

        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                cnt +=num[i]*num[j];
                //System.out.println(i+" ,"+j);
            }
        }
        System.out.println(cnt);
    }
}
